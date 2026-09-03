package p407o0Oo0Oo;

import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import com.yalla.yalla.data.db.model.MusicTable;
import p110o000ooo0.o0OO00O;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends o0OO00O<MusicTable> {
    public o0oOOo(YlAppDataBase ylAppDataBase) {
        super(ylAppDataBase);
    }

    @Override // p110o000ooo0.o000Oo0
    public final String OooO0OO() {
        return "INSERT OR REPLACE INTO `MusicTable` (`id`,`mTitle`,`mTitleKey`,`mDuration`,`mArtist`,`mArtistKey`,`mComposer`,`mAlbum`,`mAlbumKey`,`mDisplayName`,`mMimeType`,`mPath`,`user`,`initialLetter`,`isSelect`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // p110o000ooo0.o0OO00O
    public final void OooO0o0(SupportSQLiteStatement supportSQLiteStatement, MusicTable musicTable) {
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
