package p580o0oOoOoo;

import android.content.Context;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.model.LogOutFBPopConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p590o0oOooo0.O0000000;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO extends Lambda implements Function1<LogOutFBPopConfig, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableIntState f56540OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f56541OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f56542OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OO(MutableIntState mutableIntState, Context context, MutableState<Boolean> mutableState) {
        super(1);
        this.f56540OooO0Oo = mutableIntState;
        this.f56542OooO0o0 = context;
        this.f56541OooO0o = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LogOutFBPopConfig logOutFBPopConfig) {
        LogOutFBPopConfig logOutFBPopConfig2 = logOutFBPopConfig;
        if (logOutFBPopConfig2 != null) {
            this.f56540OooO0Oo.setIntValue(logOutFBPopConfig2.getPopType());
            if (logOutFBPopConfig2.getPopType() == 0) {
                O0000000.OooO0O0(this.f56542OooO0o0);
            } else {
                this.f56541OooO0o.setValue(Boolean.TRUE);
            }
        }
        return Unit.INSTANCE;
    }
}
