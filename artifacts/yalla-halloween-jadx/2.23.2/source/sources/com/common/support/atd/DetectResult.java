package com.common.support.atd;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b \b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020&X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0010\"\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001a\u00101\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0010\"\u0004\b3\u0010\u0012R\u001a\u00104\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0010\"\u0004\b6\u0010\u0012R\u001a\u00107\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0010\"\u0004\b9\u0010\u0012R\u001a\u0010:\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0010\"\u0004\b<\u0010\u0012R\u001a\u0010=\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0010\"\u0004\b?\u0010\u0012R\u001a\u0010@\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0010\"\u0004\bB\u0010\u0012R\"\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010\tR\u001a\u0010L\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0007\"\u0004\bN\u0010\tR\u001a\u0010O\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\u0007\"\u0004\bQ\u0010\tR\u001a\u0010R\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010\tR\u001a\u0010U\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\u0007\"\u0004\bW\u0010\tR\u001a\u0010X\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u0007\"\u0004\bZ\u0010\tR\u001a\u0010[\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0010\"\u0004\b]\u0010\u0012R\u001a\u0010^\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u0007\"\u0004\b`\u0010\tR\u001a\u0010a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0007\"\u0004\bc\u0010\t¨\u0006d"}, d2 = {"Lcom/common/support/atd/DetectResult;", "", "()V", "a1", "", "getA1$annotations", "getA1", "()I", "setA1", "(I)V", "a10", "getA10", "setA10", "a11", "", "getA11", "()Ljava/lang/String;", "setA11", "(Ljava/lang/String;)V", "a12", "getA12", "setA12", "a13", "getA13", "setA13", "a14", "getA14", "setA14", "a15", "getA15", "setA15", "a16", "getA16", "setA16", "a17", "getA17", "setA17", "a18", "", "getA18", "()J", "setA18", "(J)V", "a19", "getA19", "setA19", "a2", "getA2", "setA2", "a20", "getA20", "setA20", "a21", "getA21", "setA21", "a22", "getA22", "setA22", "a23", "getA23", "setA23", "a25", "getA25", "setA25", "a26", "getA26", "setA26", "a3", "", "getA3", "()Ljava/util/List;", "setA3", "(Ljava/util/List;)V", "a4", "getA4", "setA4", "a5", "getA5", "setA5", "a6", "getA6", "setA6", "a7", "getA7", "setA7", "a8", "getA8", "setA8", "a9", "getA9", "setA9", "aid", "getAid", "setAid", "f", "getF", "setF", "v", "getV", "setV", "lib_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class DetectResult {
    private int a1;
    private int a10;
    private int a12;
    private int a13;
    private int a14;
    private int a15;
    private long a18;
    private int a2;

    @Nullable
    private List<Integer> a3;
    private int a4;
    private int a5;
    private int a6;
    private int a7;
    private int a8;
    private int a9;
    private int f;

    @NotNull
    private String a11 = "";

    @NotNull
    private String a16 = "";

    @NotNull
    private String a17 = "";

    @NotNull
    private String a19 = "";

    @NotNull
    private String a20 = "";

    @NotNull
    private String a21 = "";

    @NotNull
    private String aid = "";
    private int v = 2;

    @NotNull
    private String a22 = "";

    @NotNull
    private String a23 = "";

    @NotNull
    private String a25 = "";

    @NotNull
    private String a26 = "";

    @Deprecated(message = "Use a23")
    public static /* synthetic */ void getA1$annotations() {
    }

    public final int getA1() {
        return this.a1;
    }

    public final int getA10() {
        return this.a10;
    }

    @NotNull
    public final String getA11() {
        return this.a11;
    }

    public final int getA12() {
        return this.a12;
    }

    public final int getA13() {
        return this.a13;
    }

    public final int getA14() {
        return this.a14;
    }

    public final int getA15() {
        return this.a15;
    }

    @NotNull
    public final String getA16() {
        return this.a16;
    }

    @NotNull
    public final String getA17() {
        return this.a17;
    }

    public final long getA18() {
        return this.a18;
    }

    @NotNull
    public final String getA19() {
        return this.a19;
    }

    public final int getA2() {
        return this.a2;
    }

    @NotNull
    public final String getA20() {
        return this.a20;
    }

    @NotNull
    public final String getA21() {
        return this.a21;
    }

    @NotNull
    public final String getA22() {
        return this.a22;
    }

    @NotNull
    public final String getA23() {
        return this.a23;
    }

    @NotNull
    public final String getA25() {
        return this.a25;
    }

    @NotNull
    public final String getA26() {
        return this.a26;
    }

    @Nullable
    public final List<Integer> getA3() {
        return this.a3;
    }

    public final int getA4() {
        return this.a4;
    }

    public final int getA5() {
        return this.a5;
    }

    public final int getA6() {
        return this.a6;
    }

    public final int getA7() {
        return this.a7;
    }

    public final int getA8() {
        return this.a8;
    }

    public final int getA9() {
        return this.a9;
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    public final int getF() {
        return this.f;
    }

    public final int getV() {
        return this.v;
    }

    public final void setA1(int i) {
        this.a1 = i;
    }

    public final void setA10(int i) {
        this.a10 = i;
    }

    public final void setA11(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a11 = str;
    }

    public final void setA12(int i) {
        this.a12 = i;
    }

    public final void setA13(int i) {
        this.a13 = i;
    }

    public final void setA14(int i) {
        this.a14 = i;
    }

    public final void setA15(int i) {
        this.a15 = i;
    }

    public final void setA16(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a16 = str;
    }

    public final void setA17(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a17 = str;
    }

    public final void setA18(long j) {
        this.a18 = j;
    }

    public final void setA19(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a19 = str;
    }

    public final void setA2(int i) {
        this.a2 = i;
    }

    public final void setA20(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a20 = str;
    }

    public final void setA21(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a21 = str;
    }

    public final void setA22(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a22 = str;
    }

    public final void setA23(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a23 = str;
    }

    public final void setA25(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a25 = str;
    }

    public final void setA26(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.a26 = str;
    }

    public final void setA3(@Nullable List<Integer> list) {
        this.a3 = list;
    }

    public final void setA4(int i) {
        this.a4 = i;
    }

    public final void setA5(int i) {
        this.a5 = i;
    }

    public final void setA6(int i) {
        this.a6 = i;
    }

    public final void setA7(int i) {
        this.a7 = i;
    }

    public final void setA8(int i) {
        this.a8 = i;
    }

    public final void setA9(int i) {
        this.a9 = i;
    }

    public final void setAid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.aid = str;
    }

    public final void setF(int i) {
        this.f = i;
    }

    public final void setV(int i) {
        this.v = i;
    }
}
