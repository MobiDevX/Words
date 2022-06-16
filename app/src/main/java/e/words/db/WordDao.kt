package e.words.db

import androidx.room.*

@Dao
interface WordDao {

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAlphabetizedWords(): List<Word>

    @Update()
    fun update(word: Word)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(word: Word)

    @Delete()
    fun delete(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()
}