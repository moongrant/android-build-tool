package com.yalla.yalla.model.share;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000e¨\u0006!"}, d2 = {"Lcom/yalla/yalla/model/share/ShareActivityModel;", "Ljava/io/Serializable;", "()V", "activity", "", "getActivity", "()I", "setActivity", "(I)V", "image1", "", "getImage1", "()Ljava/lang/String;", "setImage1", "(Ljava/lang/String;)V", "image2", "getImage2", "setImage2", "text1", "getText1", "setText1", "text2", "getText2", "setText2", "text3", "getText3", "setText3", "text4", "getText4", "setText4", "url", "getUrl", "setUrl", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ShareActivityModel implements Serializable {
    public static final int $stable = 8;
    private int activity;

    @NotNull
    private String image1 = "";

    @NotNull
    private String image2 = "";

    @NotNull
    private String text1 = "";

    @NotNull
    private String text2 = "";

    @NotNull
    private String text3 = "";

    @NotNull
    private String text4 = "";

    @NotNull
    private String url = "";

    public final int getActivity() {
        return this.activity;
    }

    @NotNull
    public final String getImage1() {
        return this.image1;
    }

    @NotNull
    public final String getImage2() {
        return this.image2;
    }

    @NotNull
    public final String getText1() {
        return this.text1;
    }

    @NotNull
    public final String getText2() {
        return this.text2;
    }

    @NotNull
    public final String getText3() {
        return this.text3;
    }

    @NotNull
    public final String getText4() {
        return this.text4;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setActivity(int i) {
        this.activity = i;
    }

    public final void setImage1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.image1 = str;
    }

    public final void setImage2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.image2 = str;
    }

    public final void setText1(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text1 = str;
    }

    public final void setText2(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text2 = str;
    }

    public final void setText3(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text3 = str;
    }

    public final void setText4(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text4 = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }
}
