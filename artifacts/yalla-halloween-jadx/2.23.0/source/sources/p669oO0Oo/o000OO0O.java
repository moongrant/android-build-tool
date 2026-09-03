package p669oO0Oo;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p577o0oOoOoO.oOO000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f60502OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O0Oo f60503OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oOO000o f60504OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f60505OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f60506OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f60507OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f60508OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ int f60509OooOO0O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(o000O0Oo o000o0oo2, int i, oOO000o ooo000o, long j, long j2, int i2, int i3, int i4) {
        super(2);
        this.f60503OooO0Oo = o000o0oo2;
        this.f60505OooO0o0 = i;
        this.f60504OooO0o = ooo000o;
        this.f60506OooO0oO = j;
        this.f60507OooO0oo = j2;
        this.f60502OooO = i2;
        this.f60508OooOO0 = i3;
        this.f60509OooOO0O = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        o000O0Oo.OooO0Oo(this.f60503OooO0Oo, this.f60505OooO0o0, this.f60504OooO0o, this.f60506OooO0oO, this.f60507OooO0oo, this.f60502OooO, this.f60508OooOO0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f60509OooOO0O | 1));
        return Unit.INSTANCE;
    }
}
