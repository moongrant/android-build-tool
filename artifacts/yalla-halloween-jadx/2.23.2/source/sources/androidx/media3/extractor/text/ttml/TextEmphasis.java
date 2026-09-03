package androidx.media3.extractor.text.ttml;

import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: loaded from: classes2.dex */
public final class TextEmphasis {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8824OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f8825OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f8826OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Pattern f8819OooO0Oo = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final ImmutableSet<String> f8821OooO0o0 = ImmutableSet.OooOO0(2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final ImmutableSet<String> f8820OooO0o = ImmutableSet.OooOOOO("dot", "sesame", "circle");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final ImmutableSet<String> f8822OooO0oO = ImmutableSet.OooOO0(2, "filled", "open");

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final ImmutableSet<String> f8823OooO0oo = ImmutableSet.OooOOOO("after", "before", "outside");

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Position {
    }

    public TextEmphasis(int i, int i2, int i3) {
        this.f8824OooO00o = i;
        this.f8825OooO0O0 = i2;
        this.f8826OooO0OO = i3;
    }
}
