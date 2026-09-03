package p158o00OoOOO;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f38370OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f38371OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f38372OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f38373OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f38374OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f38375OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f38376OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f38377OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Function2<Composer, Integer, Unit> f38378OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ Modifier f38379OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f38380OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final /* synthetic */ int f38381OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ int f38382OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final /* synthetic */ int f38383OooOOo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0Oo0oo(MutableState<Boolean> mutableState, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4, boolean z, Function0<Unit> function0, Function0<Unit> function1, Function2<? super Composer, ? super Integer, Unit> function5, Function2<? super Composer, ? super Integer, Unit> function6, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function7, Modifier modifier, int i, int i2, int i3) {
        super(2);
        this.f38371OooO0Oo = mutableState;
        this.f38373OooO0o0 = function3;
        this.f38372OooO0o = function2;
        this.f38374OooO0oO = function4;
        this.f38375OooO0oo = z;
        this.f38370OooO = function0;
        this.f38376OooOO0 = function1;
        this.f38377OooOO0O = function5;
        this.f38378OooOO0o = function6;
        this.f38380OooOOO0 = function7;
        this.f38379OooOOO = modifier;
        this.f38381OooOOOO = i;
        this.f38382OooOOOo = i2;
        this.f38383OooOOo0 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        oo000o.OooO0o(this.f38371OooO0Oo, this.f38373OooO0o0, this.f38372OooO0o, this.f38374OooO0oO, this.f38375OooO0oo, this.f38370OooO, this.f38376OooOO0, this.f38377OooOO0O, this.f38378OooOO0o, this.f38380OooOOO0, this.f38379OooOOO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f38381OooOOOO | 1), RecomposeScopeImplKt.updateChangedFlags(this.f38382OooOOOo), this.f38383OooOOo0);
        return Unit.INSTANCE;
    }
}
