package p105o000oo0o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0O0 extends Lambda implements Function0<Pair<? extends List<String>, ? extends String>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f35721OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0O0(o000O0Oo o000o0oo2) {
        super(0);
        this.f35721OooO0Oo = o000o0oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pair<? extends List<String>, ? extends String> invoke() {
        String str = this.f35721OooO0Oo.f35725OooO00o;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(str).getFragment();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(fragment);
        o000O0Oo.OooO00o(fragment, arrayList, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fragRegex.toString()");
        return TuplesKt.to(arrayList, string);
    }
}
