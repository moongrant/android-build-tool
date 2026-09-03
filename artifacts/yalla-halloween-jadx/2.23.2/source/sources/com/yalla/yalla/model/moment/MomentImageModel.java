package com.yalla.yalla.model.moment;

import android.support.v4.media.session.OooO0OO;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.Serializable;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import o000O0Oo.OooOOO0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003J\b\u0010\u001d\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/model/moment/MomentImageModel;", "Ljava/io/Serializable;", "url", "", "(Ljava/lang/String;)V", "duration", "", "getDuration", "()J", "setDuration", "(J)V", "gifType", "", "getGifType", "()I", "setGifType", "(I)V", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "getHeight", "setHeight", "getUrl", "()Ljava/lang/String;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getWidth", "setWidth", "isGif", "", "setSize", "size", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMomentImageModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentImageModel.kt\ncom/yalla/yalla/model/moment/MomentImageModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,49:1\n731#2,9:50\n37#3,2:59\n*S KotlinDebug\n*F\n+ 1 MomentImageModel.kt\ncom/yalla/yalla/model/moment/MomentImageModel\n*L\n23#1:50,9\n23#1:59,2\n*E\n"})
public final class MomentImageModel implements Serializable {
    public static final int $stable = 8;
    private long duration;
    private int gifType;
    private int height;

    @NotNull
    private final String url;
    private int width;

    /* JADX WARN: Multi-variable type inference failed */
    public MomentImageModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final long getDuration() {
        return this.duration;
    }

    public final int getGifType() {
        return this.gifType;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isGif() {
        if (this.gifType == 1) {
            return true;
        }
        String str = this.url;
        return str != null ? StringsKt__StringsKt.contains(str, ".gif", true) : false;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setGifType(int i) {
        this.gifType = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077 A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #0 {Exception -> 0x0073, blocks: (B:22:0x0063, B:26:0x0077), top: B:31:0x0063 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x008a A[SYNTHETIC] */
    @NotNull
    public final MomentImageModel setSize(@NotNull String size) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(size, "size");
        if (!TextUtils.isEmpty(size) && StringsKt__StringsKt.contains$default(size, "*", false, 2, (Object) null)) {
            List<String> listSplit = new Regex("\\*").split(size, 0);
            if (listSplit.isEmpty()) {
                listEmptyList = CollectionsKt.emptyList();
                break;
            }
            ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    listEmptyList = CollectionsKt.emptyList();
                    break;
                }
                if (!(listIterator.previous().length() == 0)) {
                    listEmptyList = CollectionsKt.take(listSplit, listIterator.nextIndex() + 1);
                    break;
                }
            }
            String[] strArr = (String[]) listEmptyList.toArray(new String[0]);
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                if (i == 0) {
                    try {
                        Integer numValueOf = Integer.valueOf(strArr[i]);
                        Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(...)");
                        this.width = numValueOf.intValue();
                        if (i == 1) {
                            Integer numValueOf2 = Integer.valueOf(strArr[i]);
                            Intrinsics.checkNotNullExpressionValue(numValueOf2, "valueOf(...)");
                            this.height = numValueOf2.intValue();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (i == 1) {
                    Integer numValueOf3 = Integer.valueOf(strArr[i]);
                    Intrinsics.checkNotNullExpressionValue(numValueOf3, "valueOf(...)");
                    this.height = numValueOf3.intValue();
                }
            }
        }
        return this;
    }

    public final void setWidth(int i) {
        this.width = i;
    }

    @NotNull
    public String toString() {
        String str = this.url;
        int i = this.width;
        int i2 = this.height;
        int i3 = this.gifType;
        long j = this.duration;
        StringBuilder sb = new StringBuilder("MomentImageModel{url='");
        sb.append(str);
        sb.append(", width=");
        sb.append(i);
        sb.append(", height=");
        OooOOO0.OooO00o(sb, i2, ", gifType=", i3, ", duration=");
        return OooO0OO.OooO0O0(sb, j, "}");
    }

    public MomentImageModel(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
    }

    public /* synthetic */ MomentImageModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
