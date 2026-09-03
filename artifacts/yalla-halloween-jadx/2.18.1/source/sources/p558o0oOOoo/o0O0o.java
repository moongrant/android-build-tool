package p558o0oOOoo;

import android.view.View;
import android.view.ViewStub;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.mixedroom.MixedRoomActivity;
import com.weieyu.yalla.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p142o00OOooO.o00000O;
import p162o00OoOOo.o0O00o0;
import p530o0o0OOO.o00OO00O;
import p536o0o0OOoo.f;
import p545o0o0OoOo.c8;
import p649o0ooOOoo.eh;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O0o extends c8 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f44809OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f44810OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<eh> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final eh invoke() {
            eh ehVarOooO00o = eh.OooO00o(((ViewStub) o0O0o.this.f44365OooO00o.findViewById(R.id.vsPK)).inflate());
            o0O0o o0o0o = o0O0o.this;
            ehVarOooO00o.f49289OooOOO0.setEnabled(false);
            ehVarOooO00o.f49277OooO00o.setOnClickListener(o0O00o0.f32504Oooo0o);
            ehVarOooO00o.f49287OooOO0o.setOnClickListener(new f(o0o0o, 1));
            ehVarOooO00o.f49281OooO0o.setOnClickListener(new View.OnClickListener() { // from class: o0oOOoo.o0oOOo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    o00OO00O.f43313OooooOo.OooO00o().f43364OoooOo0.postValue(null);
                }
            });
            Intrinsics.checkNotNullExpressionValue(ehVarOooO00o, "bind(clPK).also {\n      …stValue(null) }\n        }");
            return ehVarOooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f44809OooO0O0 = LazyKt.lazy(new OooO00o());
        o00OO00O.f43313OooooOo.OooO00o().f43364OoooOo0.observe(this.f44365OooO00o, new o00000O(this, 2));
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO00o() {
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO0O0() {
        if (this.f44810OooO0OO) {
            o00OO00O.f43313OooooOo.OooO00o().f43364OoooOo0.postValue(null);
        }
    }

    public final eh OooO0OO() {
        return (eh) this.f44809OooO0O0.getValue();
    }
}
