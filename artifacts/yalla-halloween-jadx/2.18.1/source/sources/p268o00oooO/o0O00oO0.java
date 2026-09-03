package p268o00oooO;

import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00oO0 extends Lambda implements Function1<Map.Entry<? extends String, ? extends String>, CharSequence> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o0O00oO0 f34944Oooo0o = new o0O00oO0();

    public o0O00oO0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(Map.Entry<? extends String, ? extends String> entry) {
        Map.Entry<? extends String, ? extends String> it = entry;
        Intrinsics.checkNotNullParameter(it, "it");
        StringBuilder sb = new StringBuilder();
        String key = it.getKey();
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        Objects.requireNonNull(key, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = key.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        sb.append('=');
        sb.append(it.getValue());
        return sb.toString();
    }
}
