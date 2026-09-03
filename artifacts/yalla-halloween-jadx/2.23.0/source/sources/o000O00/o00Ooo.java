package o000O00;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o00Ooo extends Lambda implements Function0<Pair<? extends List<String>, ? extends String>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O f34406OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(o00O0O o00o0o2) {
        super(0);
        this.f34406OooO0Oo = o00o0o2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Pair<? extends List<String>, ? extends String> invoke() {
        String str = this.f34406OooO0Oo.f34387OooO00o;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(str).getFragment();
        StringBuilder sb = new StringBuilder();
        Intrinsics.checkNotNull(fragment);
        o00O0O.OooO00o(fragment, arrayList, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fragRegex.toString()");
        return TuplesKt.to(arrayList, string);
    }
}
