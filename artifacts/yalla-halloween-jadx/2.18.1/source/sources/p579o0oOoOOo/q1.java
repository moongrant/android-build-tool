package p579o0oOoOOo;

import android.content.Context;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o00000O;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.model.UpdateAppModel;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.o00O00OO;
import p536o0o0OOoo.f;
import p649o0ooOOoo.k8;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class q1 extends o00O00OO<q1> {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00O000o f46252OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f46253OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<ViewGroup> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewGroup invoke() {
            return q1.this.f34201OooO0OO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(@NotNull final Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f46252OooO0oO = new o00O000o(Reflection.getOrCreateKotlinClass(k8.class), context, new OooO00o());
        this.f46253OooO0oo = true;
        OooOOO().f49834OooO0o0.setMovementMethod(ScrollingMovementMethod.getInstance());
        OooOOO().f49831OooO0OO.setOnClickListener(new f(this, 2));
        OooOOO().f49830OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0oOoOOo.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q1 this$0 = this.f46025Oooo0o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                o00000O.OooO0O0().OooO0oo("cancel", true);
                Objects.requireNonNull(this$0);
                this$0.OooO0Oo();
            }
        });
        OooOOO().f49832OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0oOoOOo.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q1 this$0 = this.f46248Oooo0o;
                Context context2 = context;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(context2, "$context");
                Objects.requireNonNull(this$0);
                PackManager.INSTANCE.toGooglePlay(context2);
                this$0.OooO0Oo();
            }
        });
    }

    @NotNull
    public final k8 OooOOO() {
        return (k8) this.f46252OooO0oO.getValue();
    }

    public final void OooOOOO(@Nullable UpdateAppModel updateAppModel) {
        if (updateAppModel != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("V ");
            sbOooO0o0.append(updateAppModel.getTargetVersionName());
            OooOOO().f49835OooO0oO.setText(sbOooO0o0.toString());
            OooOOO().f49833OooO0o.setText(o000O0O0.OooO0OO(R.string.updata_pop_tops_title));
            OooOOO().f49834OooO0o0.setText(o000O0O0.OooO0OO(R.string.updata_pop_tops_content) + '\n' + updateAppModel.getContent());
            OooOOO().f49832OooO0Oo.setText(o000O0O0.OooO0OO(R.string.Upgrade));
            if (OooO.OooO0O0(updateAppModel.getTargetVersionCode()) <= OooO.OooO0O0(updateAppModel.getCurrentVersionCode())) {
                OooO0Oo();
                return;
            }
            this.f46253OooO0oo = true;
            OooOOO().f49830OooO0O0.setVisibility(0);
            if (updateAppModel.getUpApkCode() == 2) {
                this.f46253OooO0oo = false;
                OooOOO().f49830OooO0O0.setVisibility(8);
                OooO0oO(this.f46253OooO0oo);
            }
            OooOOO0();
        }
    }
}
