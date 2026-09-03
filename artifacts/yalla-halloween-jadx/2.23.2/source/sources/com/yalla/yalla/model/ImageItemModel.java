package com.yalla.yalla.model;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.app.application.App;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import p591o0oOoooO.b3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0000J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0003J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/model/ImageItemModel;", "Ljava/io/Serializable;", "url", "", "(Ljava/lang/String;)V", "gifType", "", "getGifType", "()I", "setGifType", "(I)V", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "getHeight", "setHeight", "getUrl", "()Ljava/lang/String;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getWidth", "setWidth", "initLocalSize", "setSize", "size", "toString", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageItemModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageItemModel.kt\ncom/yalla/yalla/model/ImageItemModel\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,86:1\n37#2,2:87\n*S KotlinDebug\n*F\n+ 1 ImageItemModel.kt\ncom/yalla/yalla/model/ImageItemModel\n*L\n60#1:87,2\n*E\n"})
public final class ImageItemModel implements Serializable {
    public static final int $stable = 8;
    private int gifType;
    private int height;

    @NotNull
    private final String url;
    private int width;

    public ImageItemModel(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.gifType = -1;
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

    @NotNull
    public final ImageItemModel initLocalSize() {
        if (!TextUtils.isEmpty(this.url)) {
            App app = App.f22232OooO0o;
            Intrinsics.checkNotNullExpressionValue(app, "getContext(...)");
            BitmapFactory.Options optionsOooO00o = b3.OooO00o(app, this.url);
            this.width = optionsOooO00o.outWidth;
            this.height = optionsOooO00o.outHeight;
        }
        return this;
    }

    public final void setGifType(int i) {
        this.gifType = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[Catch: Exception -> 0x003f, TRY_LEAVE, TryCatch #0 {Exception -> 0x003f, blocks: (B:10:0x002f, B:15:0x0044), top: B:20:0x002f }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057 A[SYNTHETIC] */
    @NotNull
    public final ImageItemModel setSize(@NotNull String size) {
        Intrinsics.checkNotNullParameter(size, "size");
        if (!TextUtils.isEmpty(size) && StringsKt__StringsKt.contains$default(size, "*", false, 2, (Object) null)) {
            String[] strArr = (String[]) new Regex("\\*").split(size, 0).toArray(new String[0]);
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
        return "ImageItemModel{url='" + this.url + "', width=" + this.width + ", height=" + this.height + ", gifType=" + this.gifType + "}";
    }

    @NotNull
    public final ImageItemModel initLocalSize(int width, int height) {
        this.width = width;
        this.height = height;
        return this;
    }
}
