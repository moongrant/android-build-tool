package com.google.android.exoplayer2.text.ttml;

import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class TextEmphasis {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f13474OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f13475OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f13476OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f13469OooO0Oo = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ImmutableSet<String> f13471OooO0o0 = ImmutableSet.OooOO0(2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ImmutableSet<String> f13470OooO0o = ImmutableSet.OooOOOO("dot", "sesame", "circle");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ImmutableSet<String> f13472OooO0oO = ImmutableSet.OooOO0(2, "filled", "open");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final ImmutableSet<String> f13473OooO0oo = ImmutableSet.OooOOOO("after", "before", "outside");

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public TextEmphasis(int i, int i2, int i3) {
        this.f13474OooO00o = i;
        this.f13475OooO0O0 = i2;
        this.f13476OooO0OO = i3;
    }
}
