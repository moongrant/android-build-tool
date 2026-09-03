package p561o0oOOooo;

import com.facebook.appevents.AppEventsConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class oOo0000O extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oOo000Oo f44921Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f44922Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0000O(oOo000Oo ooo000oo, int i) {
        super(0);
        this.f44921Oooo0o = ooo000oo;
        this.f44922Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        o0O00000.OooO0OO("InRoom_switch_mic_success");
        this.f44921Oooo0o.OooO(this.f44922Oooo0oO, AppEventsConstants.EVENT_PARAM_VALUE_NO, false, false);
        return null;
    }
}
