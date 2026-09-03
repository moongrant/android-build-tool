package p536o0o0OOoo;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.message.SystemMessageActivity;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import p089o000o000.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
public final class v1<T> implements Observer {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f43880OooO00o;

    public v1(SystemMessageActivity systemMessageActivity) {
        this.f43880OooO00o = systemMessageActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.f43880OooO00o), null, null, new w1(this.f43880OooO00o, (o0O0ooO) t, null), 3, null);
    }
}
