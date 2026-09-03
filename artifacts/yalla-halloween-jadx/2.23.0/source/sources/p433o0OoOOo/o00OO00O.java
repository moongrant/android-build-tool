package p433o0OoOOo;

import android.text.Editable;
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
import p147o00Oo0Oo.o000OOo;
import p203o00o0o0o.o000OOo0;
import p489o0o00OO0.OooO0o;
import p490o0o00OOO.OooOOOO;
import p584o0oOooO0.oO00O0oO;
import p585o0oOooOO.h;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO0o f45992OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f45993OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooOOOO f45994OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final View f45995OooO0Oo;

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f45996OooO0Oo;

        public OooO00o(o00OO000 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f45996OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f45996OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f45996OooO0Oo;
        }

        public final int hashCode() {
            return this.f45996OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45996OooO0Oo.invoke(obj);
        }
    }

    public o00OO00O(@NotNull MixedRoomActivity activity, @NotNull OooO0o dataMedium) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(dataMedium, "dataMedium");
        this.f45992OooO00o = dataMedium;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(0);
        this.f45993OooO0O0 = mutableLiveData;
        this.f45994OooO0OO = new OooOOOO(activity);
        this.f45995OooO0Oo = activity.findViewById(oO00O0oO.bottom_message_input_container_placeholder);
        View viewFindViewById = activity.findViewById(oO00O0oO.compose_room_bottom_input);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById<Co…ompose_room_bottom_input)");
        o000OOo.OooO0Oo((ComposeView) viewFindViewById, ComposableLambdaKt.composableLambdaInstance(-19076157, true, new o00O(this)));
        mutableLiveData.observe(activity, new OooO00o(new o00OO000(this)));
    }

    public final void OooO00o(@NotNull h atMessage, boolean z) {
        Intrinsics.checkNotNullParameter(atMessage, "atMessage");
        OooO0O0();
        OooOOOO oooOOOO = this.f45994OooO0OO;
        if (z) {
            o0o0Oo o0o0ooOooO0OO = oooOOOO.OooO0OO();
            o0o0ooOooO0OO.f46032OooO00o.setValue(null);
            o0o0ooOooO0OO.f46033OooO0O0.setValue(Boolean.FALSE);
        }
        MessageEditText messageEditTextOooO00o = oooOOOO.OooO00o();
        messageEditTextOooO00o.f30977OooOo0 = new o000OOo0(messageEditTextOooO00o);
        messageEditTextOooO00o.setText("");
        messageEditTextOooO00o.setTextIsSelectable(true);
        messageEditTextOooO00o.OooO0Oo(atMessage);
        Editable text = messageEditTextOooO00o.getText();
        messageEditTextOooO00o.setSelection(text != null ? text.length() : 0);
    }

    public final void OooO0O0() {
        o0OO000.OooO0O0("202021", MapsKt.mapOf(new Pair("sources", 1)));
        o0OO000.OooO00o("102059");
        this.f45994OooO0OO.f48505OooOO0.setValue(Boolean.TRUE);
    }
}
