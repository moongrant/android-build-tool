package com.yalla.yalla.model;

import androidx.compose.animation.OooO0O0;
import androidx.compose.compiler.plugins.kotlin.OooO0OO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.util.Player.Audio;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/model/MusicFileModel;", "", "fileName", "", "filePath", "songsCount", "", "songList", "", "Lcom/yalla/yalla/util/Player/Audio;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getFileName", "()Ljava/lang/String;", "getFilePath", "getSongList", "()Ljava/util/List;", "getSongsCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MusicFileModel {
    public static final int $stable = 8;

    @NotNull
    private final String fileName;

    @NotNull
    private final String filePath;

    @NotNull
    private final List<Audio> songList;
    private final int songsCount;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicFileModel(@NotNull String fileName, @NotNull String filePath, int i, @NotNull List<? extends Audio> songList) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(songList, "songList");
        this.fileName = fileName;
        this.filePath = filePath;
        this.songsCount = i;
        this.songList = songList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MusicFileModel copy$default(MusicFileModel musicFileModel, String str, String str2, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = musicFileModel.fileName;
        }
        if ((i2 & 2) != 0) {
            str2 = musicFileModel.filePath;
        }
        if ((i2 & 4) != 0) {
            i = musicFileModel.songsCount;
        }
        if ((i2 & 8) != 0) {
            list = musicFileModel.songList;
        }
        return musicFileModel.copy(str, str2, i, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSongsCount() {
        return this.songsCount;
    }

    @NotNull
    public final List<Audio> component4() {
        return this.songList;
    }

    @NotNull
    public final MusicFileModel copy(@NotNull String fileName, @NotNull String filePath, int songsCount, @NotNull List<? extends Audio> songList) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(songList, "songList");
        return new MusicFileModel(fileName, filePath, songsCount, songList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicFileModel)) {
            return false;
        }
        MusicFileModel musicFileModel = (MusicFileModel) other;
        return Intrinsics.areEqual(this.fileName, musicFileModel.fileName) && Intrinsics.areEqual(this.filePath, musicFileModel.filePath) && this.songsCount == musicFileModel.songsCount && Intrinsics.areEqual(this.songList, musicFileModel.songList);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final List<Audio> getSongList() {
        return this.songList;
    }

    public final int getSongsCount() {
        return this.songsCount;
    }

    public int hashCode() {
        return this.songList.hashCode() + ((OooO0O0.OooO00o(this.filePath, this.fileName.hashCode() * 31, 31) + this.songsCount) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.fileName;
        String str2 = this.filePath;
        int i = this.songsCount;
        List<Audio> list = this.songList;
        StringBuilder sbOooO00o = OooO0OO.OooO00o("MusicFileModel(fileName=", str, ", filePath=", str2, ", songsCount=");
        sbOooO00o.append(i);
        sbOooO00o.append(", songList=");
        sbOooO00o.append(list);
        sbOooO00o.append(")");
        return sbOooO00o.toString();
    }
}
