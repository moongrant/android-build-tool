package com.common.support.roomgiftplayer.entity;

import android.graphics.Bitmap;
import androidx.compose.compiler.plugins.kotlin.OooO0o;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0005J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0013\u001a\u00020\u0005J\b\u0010\u0015\u001a\u00020\u0005H\u0016R+\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR+\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\r\u0010\bR+\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\f0\u0004j\b\u0012\u0004\u0012\u00020\f`\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0010\u0010\b¨\u0006\u0017"}, d2 = {"Lcom/common/support/roomgiftplayer/entity/GiftPlayReplaceInfo;", "", "()V", "customHideInfo", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getCustomHideInfo", "()Ljava/util/ArrayList;", "customHideInfo$delegate", "Lkotlin/Lazy;", "replaceImageInfoList", "Lcom/common/support/roomgiftplayer/entity/GiftPlayReplaceInfo$GiftPlayReplaceSingleInfo;", "getReplaceImageInfoList", "replaceImageInfoList$delegate", "replaceTextInfoList", "getReplaceTextInfoList", "replaceTextInfoList$delegate", "getFromImage", "position", "getFromText", "toString", "GiftPlayReplaceSingleInfo", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GiftPlayReplaceInfo {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: replaceImageInfoList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy replaceImageInfoList = LazyKt.lazy(new Function0<ArrayList<GiftPlayReplaceSingleInfo>>() { // from class: com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo$replaceImageInfoList$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ArrayList<GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo> invoke() {
            return new ArrayList<>();
        }
    });

    /* JADX INFO: renamed from: replaceTextInfoList$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy replaceTextInfoList = LazyKt.lazy(new Function0<ArrayList<GiftPlayReplaceSingleInfo>>() { // from class: com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo$replaceTextInfoList$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ArrayList<GiftPlayReplaceInfo.GiftPlayReplaceSingleInfo> invoke() {
            return new ArrayList<>();
        }
    });

    /* JADX INFO: renamed from: customHideInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy customHideInfo = LazyKt.lazy(new Function0<ArrayList<String>>() { // from class: com.common.support.roomgiftplayer.entity.GiftPlayReplaceInfo$customHideInfo$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ArrayList<String> invoke() {
            return new ArrayList<>();
        }
    });

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/common/support/roomgiftplayer/entity/GiftPlayReplaceInfo$GiftPlayReplaceSingleInfo;", "", "position", "", "content", "(Ljava/lang/String;Ljava/lang/String;)V", "bitmap", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "getContent", "()Ljava/lang/String;", "setContent", "(Ljava/lang/String;)V", "getPosition", "setPosition", "toString", "RoomGiftVideoPlayer_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class GiftPlayReplaceSingleInfo {
        public static final int $stable = 8;

        @Nullable
        private Bitmap bitmap;

        @Nullable
        private String content;

        @Nullable
        private String position;

        /* JADX WARN: Multi-variable type inference failed */
        public GiftPlayReplaceSingleInfo() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Nullable
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @Nullable
        public final String getPosition() {
            return this.position;
        }

        public final void setBitmap(@Nullable Bitmap bitmap) {
            this.bitmap = bitmap;
        }

        public final void setContent(@Nullable String str) {
            this.content = str;
        }

        public final void setPosition(@Nullable String str) {
            this.position = str;
        }

        @NotNull
        public String toString() {
            String str = this.position;
            String str2 = this.content;
            Bitmap bitmap = this.bitmap;
            StringBuilder sbOooO0OO = OooO0o.OooO0OO("GiftPlayReplaceSingleInfo(position=", str, ", content=", str2, ", bitmap=");
            sbOooO0OO.append(bitmap);
            sbOooO0OO.append(")");
            return sbOooO0OO.toString();
        }

        public GiftPlayReplaceSingleInfo(@Nullable String str, @Nullable String str2) {
            this.position = str;
            this.content = str2;
        }

        public /* synthetic */ GiftPlayReplaceSingleInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    @NotNull
    public final ArrayList<String> getCustomHideInfo() {
        return (ArrayList) this.customHideInfo.getValue();
    }

    @Nullable
    public final GiftPlayReplaceSingleInfo getFromImage(@NotNull String position) {
        Object next;
        Intrinsics.checkNotNullParameter(position, "position");
        Iterator<T> it = getReplaceImageInfoList().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((GiftPlayReplaceSingleInfo) next).getPosition(), position)) {
                return (GiftPlayReplaceSingleInfo) next;
            }
        }
        next = null;
        return (GiftPlayReplaceSingleInfo) next;
    }

    @Nullable
    public final GiftPlayReplaceSingleInfo getFromText(@NotNull String position) {
        Object next;
        Intrinsics.checkNotNullParameter(position, "position");
        Iterator<T> it = getReplaceTextInfoList().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(((GiftPlayReplaceSingleInfo) next).getPosition(), position)) {
                return (GiftPlayReplaceSingleInfo) next;
            }
        }
        next = null;
        return (GiftPlayReplaceSingleInfo) next;
    }

    @NotNull
    public final ArrayList<GiftPlayReplaceSingleInfo> getReplaceImageInfoList() {
        return (ArrayList) this.replaceImageInfoList.getValue();
    }

    @NotNull
    public final ArrayList<GiftPlayReplaceSingleInfo> getReplaceTextInfoList() {
        return (ArrayList) this.replaceTextInfoList.getValue();
    }

    @NotNull
    public String toString() {
        return "GiftPlayReplaceInfo(replaceImageInfoList=" + getReplaceImageInfoList() + ", replaceTextInfoList=" + getReplaceTextInfoList() + ", customHideInfo=" + getCustomHideInfo() + ")";
    }
}
