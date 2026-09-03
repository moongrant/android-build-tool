package p442o0OoOo0O;

import android.text.Editable;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.ui.view.editTextSpan.MessageEditText;
import kotlin.Function;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p423o0OoO0OO.o00O0OOO;
import p495o0o00Oo.OooOO0;
import p557o0oOOooO.oO00o0;
import p557o0oOOooO.oOo00ooO;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOO0 f47219OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f47220OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final p497o0o00OoO.o0000 f47221OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f47222OooO0Oo;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f47223OooO0Oo;

        public OooO00o(o0000Ooo function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f47223OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f47223OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f47223OooO0Oo;
        }

        public final int hashCode() {
            return this.f47223OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f47223OooO0Oo.invoke(obj);
        }
    }

    public o0000(@NotNull MixedRoomActivity activity, @NotNull OooOO0 dataMedium) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dataMedium, "dataMedium");
        this.f47219OooO00o = dataMedium;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(0);
        this.f47220OooO0O0 = mutableLiveData;
        this.f47221OooO0OO = new p497o0o00OoO.o0000(activity);
        this.f47222OooO0Oo = activity.findViewById(o0OO00O.bottom_message_input_container_placeholder);
        View viewFindViewById = activity.findViewById(o0OO00O.compose_room_bottom_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        o0000oo.OooO0Oo((ComposeView) viewFindViewById, ComposableLambdaKt.composableLambdaInstance(-19076157, true, new o00000OO(this)));
        mutableLiveData.observe(activity, new OooO00o(new o0000Ooo(this)));
    }

    public final void OooO00o(@NotNull oOo00ooO atMessage, boolean z) {
        Intrinsics.checkNotNullParameter(atMessage, "atMessage");
        OooO0O0();
        p497o0o00OoO.o0000 o0000Var = this.f47221OooO0OO;
        if (z) {
            o000 o000VarOooO0OO = o0000Var.OooO0OO();
            o000VarOooO0OO.f47211OooO00o.setValue(null);
            o000VarOooO0OO.f47212OooO0O0.setValue(Boolean.FALSE);
        }
        final MessageEditText messageEditTextOooO00o = o0000Var.OooO00o();
        messageEditTextOooO00o.f30432OooOo0 = new oO00o0() { // from class: o0OoOo0O.o00000O0
            @Override // p557o0oOOooO.oO00o0
            public final void OooO00o(Editable editable, int i, int i2) {
                MessageEditText this_apply = messageEditTextOooO00o;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                if (editable != null) {
                    editable.setSpan(new ForegroundColorSpan(o00O0OOO.OooO00o(o0OOO0o.color_FF7217, this_apply)), i, i2, 33);
                }
            }
        };
        messageEditTextOooO00o.setText("");
        messageEditTextOooO00o.setTextIsSelectable(true);
        messageEditTextOooO00o.OooO0Oo(atMessage);
        Editable text = messageEditTextOooO00o.getText();
        messageEditTextOooO00o.setSelection(text != null ? text.length() : 0);
    }

    public final void OooO0O0() {
        o0oo0000.OooO00o.OooO0OO("202021", MapsKt.mapOf(new Pair("sources", 1)));
        o0oo0000.OooO00o.OooO0O0("102059");
        this.f47221OooO0OO.f49690OooOO0.setValue(Boolean.TRUE);
    }
}
