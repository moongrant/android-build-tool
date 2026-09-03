package p105o000oo0o;

import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$fragPattern$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,651:1\n1#2:652\n*E\n"})
public final class o000O extends Lambda implements Function0<Pattern> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f35715OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o000O0Oo o000o0oo2) {
        super(0);
        this.f35715OooO0Oo = o000o0oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pattern invoke() {
        String str = (String) this.f35715OooO0Oo.f35735OooOO0o.getValue();
        if (str != null) {
            return Pattern.compile(str, 2);
        }
        return null;
    }
}
