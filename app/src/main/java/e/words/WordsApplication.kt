package e.words

import android.app.Application
import e.words.db.WordRoomDatabase

class WordsApplication : Application() {
    val database by lazy { WordRoomDatabase.getDatabase(this) }
}