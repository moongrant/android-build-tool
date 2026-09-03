package p519o0o0O0oO;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p396o0Oo0O.OooOOOO;
import p641o0ooOOOO.g1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppealDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppealDialog.kt\ncom/yalla/yalla/ui/dialog/AppealDialog\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,63:1\n65#2,16:64\n93#2,3:80\n*S KotlinDebug\n*F\n+ 1 AppealDialog.kt\ncom/yalla/yalla/ui/dialog/AppealDialog\n*L\n40#1:64,16\n40#1:80,3\n*E\n"})
public final class o00O000o extends o00O00OO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f52528OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final g1 f52529OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(@NotNull FragmentActivity context, long j, long j2) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52528OooOO0O = j2;
        g1 g1VarInflate = g1.inflate(LayoutInflater.from(context), this.f52533OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(g1VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        this.f52529OooOO0o = g1VarInflate;
        g1VarInflate.f57955OooO0o0.setText(String.valueOf(j));
        InputFilter[] inputFilterArr = {new OooOOOO(), new InputFilter.LengthFilter(TextFieldImplKt.AnimationDuration)};
        EditText editText = g1VarInflate.f57952OooO0OO;
        editText.setFilters(inputFilterArr);
        g1VarInflate.f57954OooO0o.setText(editText.getText().length() + "/150");
        Intrinsics.checkNotNullExpressionValue(editText, "binding.etReason");
        editText.addTextChangedListener(new o0O0ooO(this));
        g1VarInflate.f57951OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.o00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00O000o this$0 = this.f52447OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (StringsKt.trim((CharSequence) this$0.f52529OooOO0o.f57952OooO0OO.getText().toString()).toString().length() < 10) {
                    return;
                }
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o00oOoo(this$0, null), 2, null);
            }
        });
        final o00O000 listener = new o00O000(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f52534OooO0o0.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o0o0O0oO.o00O00O
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Function1 listener2 = listener;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                Intrinsics.checkNotNullExpressionValue(dialogInterface, "dialogInterface");
                listener2.invoke(dialogInterface);
            }
        });
        g1VarInflate.f57953OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0o0O0oO.o00O0000
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o00O000o this$0 = this.f52527OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
    }
}
