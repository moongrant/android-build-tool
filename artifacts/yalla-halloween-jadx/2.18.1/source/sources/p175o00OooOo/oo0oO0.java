package p175o00OooOo;

import com.yalla.yalla.model.GifListJson;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import o0000O.OooO0OO;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class oo0oO0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ GifListJson f32761Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f32762Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f32763Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oO0(GifListJson gifListJson, Function0<Unit> function0, int i) {
        super(2);
        this.f32761Oooo0o = gifListJson;
        this.f32762Oooo0oO = function0;
        this.f32763Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        OooO0OO.OooO00o(this.f32761Oooo0o, this.f32762Oooo0oO, ooo00o, this.f32763Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
