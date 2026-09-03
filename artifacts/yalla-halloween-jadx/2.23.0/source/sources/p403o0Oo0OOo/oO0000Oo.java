package p403o0Oo0OOo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.MusicTable;
import o000O0O0.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo extends OooOOO0<MusicTable> {
    public oO0000Oo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // o000O0O0.o000000
    public final String OooO0O0() {
        return "INSERT OR REPLACE INTO `MusicTable` (`id`,`mTitle`,`mTitleKey`,`mDuration`,`mArtist`,`mArtistKey`,`mComposer`,`mAlbum`,`mAlbumKey`,`mDisplayName`,`mMimeType`,`mPath`,`user`,`initialLetter`,`isSelect`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // o000O0O0.OooOOO0
    public final void OooO0Oo(SupportSQLiteStatement supportSQLiteStatement, MusicTable musicTable) {
        MusicTable musicTable2 = musicTable;
        Integer num = musicTable2.id;
        if (num == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindLong(1, num.intValue());
        }
        String str = musicTable2.mTitle;
        if (str == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, str);
        }
        String str2 = musicTable2.mTitleKey;
        if (str2 == null) {
            supportSQLiteStatement.bindNull(3);
        } else {
            supportSQLiteStatement.bindString(3, str2);
        }
        supportSQLiteStatement.bindLong(4, musicTable2.mDuration);
        String str3 = musicTable2.mArtist;
        if (str3 == null) {
            supportSQLiteStatement.bindNull(5);
        } else {
            supportSQLiteStatement.bindString(5, str3);
        }
        String str4 = musicTable2.mArtistKey;
        if (str4 == null) {
            supportSQLiteStatement.bindNull(6);
        } else {
            supportSQLiteStatement.bindString(6, str4);
        }
        String str5 = musicTable2.mComposer;
        if (str5 == null) {
            supportSQLiteStatement.bindNull(7);
        } else {
            supportSQLiteStatement.bindString(7, str5);
        }
        String str6 = musicTable2.mAlbum;
        if (str6 == null) {
            supportSQLiteStatement.bindNull(8);
        } else {
            supportSQLiteStatement.bindString(8, str6);
        }
        String str7 = musicTable2.mAlbumKey;
        if (str7 == null) {
            supportSQLiteStatement.bindNull(9);
        } else {
            supportSQLiteStatement.bindString(9, str7);
        }
        String str8 = musicTable2.mDisplayName;
        if (str8 == null) {
            supportSQLiteStatement.bindNull(10);
        } else {
            supportSQLiteStatement.bindString(10, str8);
        }
        String str9 = musicTable2.mMimeType;
        if (str9 == null) {
            supportSQLiteStatement.bindNull(11);
        } else {
            supportSQLiteStatement.bindString(11, str9);
        }
        String str10 = musicTable2.mPath;
        if (str10 == null) {
            supportSQLiteStatement.bindNull(12);
        } else {
            supportSQLiteStatement.bindString(12, str10);
        }
        String str11 = musicTable2.user;
        if (str11 == null) {
            supportSQLiteStatement.bindNull(13);
        } else {
            supportSQLiteStatement.bindString(13, str11);
        }
        String str12 = musicTable2.initialLetter;
        if (str12 == null) {
            supportSQLiteStatement.bindNull(14);
        } else {
            supportSQLiteStatement.bindString(14, str12);
        }
        supportSQLiteStatement.bindLong(15, musicTable2.isSelect ? 1L : 0L);
    }
}
