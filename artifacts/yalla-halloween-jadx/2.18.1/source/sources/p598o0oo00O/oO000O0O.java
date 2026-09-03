package p598o0oo00O;

import androidx.appcompat.app.AppCompatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p193o00o0O00.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public final class oO000O0O extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatActivity f47785Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO000O0O(AppCompatActivity appCompatActivity) {
        super(1);
        this.f47785Oooo0o = appCompatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            Oooo0 oooo0 = Oooo0.f33130OooO00o;
            AppCompatActivity appCompatActivity = this.f47785Oooo0o;
            oooo0.OooO0OO(appCompatActivity, false, new oO000O0(appCompatActivity));
        }
        return Unit.INSTANCE;
    }
}
