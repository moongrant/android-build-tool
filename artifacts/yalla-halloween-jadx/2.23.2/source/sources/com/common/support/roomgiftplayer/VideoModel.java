package com.common.support.roomgiftplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.File;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001$B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020\u0007H\u0016J\u0006\u0010\"\u001a\u00020\u001cJ\b\u0010#\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\f¨\u0006%"}, d2 = {"Lcom/common/support/roomgiftplayer/VideoModel;", "", "url", "", "type", "Lcom/common/support/roomgiftplayer/VideoType;", "repeatCount", "", "obj", "(Ljava/lang/String;Lcom/common/support/roomgiftplayer/VideoType;ILjava/lang/Object;)V", "fileNameByUrl", "getFileNameByUrl", "()Ljava/lang/String;", "fileNameByUrl$delegate", "Lkotlin/Lazy;", "getObj", "()Ljava/lang/Object;", "getRepeatCount", "()I", "getType", "()Lcom/common/support/roomgiftplayer/VideoType;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "existsFile", "videoDir", "Ljava/io/File;", "hashCode", "isDownloadUrl", "toString", "Companion", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class VideoModel {

    /* JADX INFO: renamed from: fileNameByUrl$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fileNameByUrl;

    @Nullable
    private final Object obj;
    private final int repeatCount;

    @NotNull
    private final VideoType type;

    @NotNull
    private final String url;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/common/support/roomgiftplayer/VideoModel$Companion;", "", "()V", "of", "Lcom/common/support/roomgiftplayer/VideoModel;", "url", "", "type", "Lcom/common/support/roomgiftplayer/VideoType;", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final VideoModel of(@NotNull String url, @NotNull VideoType type) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(type, "type");
            return new VideoModel(url, type, 0, null, 12, null);
        }
    }

    public VideoModel(@NotNull String url, @NotNull VideoType type, int i, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        this.url = url;
        this.type = type;
        this.repeatCount = i;
        this.obj = obj;
        this.fileNameByUrl = LazyKt.lazy(new Function0<String>() { // from class: com.common.support.roomgiftplayer.VideoModel$fileNameByUrl$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                if (StringsKt__StringsJVMKt.endsWith$default(this.this$0.getUrl(), ".mp4", false, 2, null)) {
                    return this.this$0.getUrl().hashCode() + ".mp4";
                }
                if (!StringsKt__StringsJVMKt.endsWith$default(this.this$0.getUrl(), ".svga", false, 2, null)) {
                    return String.valueOf(this.this$0.getUrl().hashCode());
                }
                return this.this$0.getUrl().hashCode() + ".svga";
            }
        });
    }

    public static /* synthetic */ VideoModel copy$default(VideoModel videoModel, String str, VideoType videoType, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = videoModel.url;
        }
        if ((i2 & 2) != 0) {
            videoType = videoModel.type;
        }
        if ((i2 & 4) != 0) {
            i = videoModel.repeatCount;
        }
        if ((i2 & 8) != 0) {
            obj = videoModel.obj;
        }
        return videoModel.copy(str, videoType, i, obj);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VideoType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRepeatCount() {
        return this.repeatCount;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getObj() {
        return this.obj;
    }

    @NotNull
    public final VideoModel copy(@NotNull String url, @NotNull VideoType type, int repeatCount, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        return new VideoModel(url, type, repeatCount, obj);
    }

    public boolean equals(@Nullable Object other) {
        String str = this.url;
        VideoModel videoModel = other instanceof VideoModel ? (VideoModel) other : null;
        return Intrinsics.areEqual(str, videoModel != null ? videoModel.url : null);
    }

    public final boolean existsFile(@NotNull File videoDir) {
        Intrinsics.checkNotNullParameter(videoDir, "videoDir");
        return new File(videoDir, getFileNameByUrl()).exists();
    }

    @NotNull
    public final String getFileNameByUrl() {
        return (String) this.fileNameByUrl.getValue();
    }

    @Nullable
    public final Object getObj() {
        return this.obj;
    }

    public final int getRepeatCount() {
        return this.repeatCount;
    }

    @NotNull
    public final VideoType getType() {
        return this.type;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final boolean isDownloadUrl() {
        return StringsKt__StringsJVMKt.startsWith(this.url, "http", true) && (StringsKt__StringsKt.contains(this.url, ".mp4", true) || StringsKt__StringsKt.contains(this.url, ".svga", true));
    }

    @NotNull
    public String toString() {
        return o0OoOo0.OooO0O0(super.toString(), "  ", getFileNameByUrl());
    }

    public /* synthetic */ VideoModel(String str, VideoType videoType, int i, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, videoType, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : obj);
    }
}
