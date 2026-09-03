package androidx.compose.ui.platform;

import android.view.View;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;
import p100o000oOoO.o0O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00O0o extends Lambda implements Function2<p100o000oOoO.oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ WrappedComposition f6584Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<p100o000oOoO.oOO00O, Integer, Unit> f6585Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0O00O0o(WrappedComposition wrappedComposition, Function2<? super p100o000oOoO.oOO00O, ? super Integer, Unit> function2) {
        super(2);
        this.f6584Oooo0o = wrappedComposition;
        this.f6585Oooo0oO = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(p100o000oOoO.oOO00O ooo00o, Integer num) {
        p100o000oOoO.oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            AndroidComposeView androidComposeView = this.f6584Oooo0o.f6342Oooo0o;
            int i = p048OoooooO.o0oOO.inspection_slot_table_set;
            Object tag = androidComposeView.getTag(i);
            Set<p046Oooooo.o0Oo0oo> set = TypeIntrinsics.isMutableSet(tag) ? (Set) tag : null;
            if (set == null) {
                Object parent = this.f6584Oooo0o.f6342Oooo0o.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(i) : null;
                set = TypeIntrinsics.isMutableSet(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(ooo00o2.OooOO0O());
                ooo00o2.OooO00o();
            }
            WrappedComposition wrappedComposition = this.f6584Oooo0o;
            p100o000oOoO.o00Oo00.OooO0o0(wrappedComposition.f6342Oooo0o, new o0O000o0(wrappedComposition, null), ooo00o2);
            WrappedComposition wrappedComposition2 = this.f6584Oooo0o;
            p100o000oOoO.o00Oo00.OooO0o0(wrappedComposition2.f6342Oooo0o, new o0O00(wrappedComposition2, null), ooo00o2);
            p100o000oOoO.o00OO0O0.OooO00o(new o0O0OO0[]{p046Oooooo.o0OO00O.f4050OooO00o.OooO0O0(set)}, p043OooooO0.o00O0000.OooO00o(ooo00o2, -1193460702, new o0OoO00O(this.f6584Oooo0o, this.f6585Oooo0oO)), ooo00o2, 56);
        }
        return Unit.INSTANCE;
    }
}
