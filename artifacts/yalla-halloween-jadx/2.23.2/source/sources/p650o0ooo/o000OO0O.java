package p650o0ooo;

import android.content.DialogInterface;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.textfield.OooO0OO;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p403o0Oo0OO.OooO0o;
import p405o0Oo0OOO.o0oOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppealDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppealDialog.kt\ncom/yalla/yalla/ui/dialog/AppealDialog\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,63:1\n65#2,16:64\n93#2,3:80\n*S KotlinDebug\n*F\n+ 1 AppealDialog.kt\ncom/yalla/yalla/ui/dialog/AppealDialog\n*L\n40#1:64,16\n40#1:80,3\n*E\n"})
public final class o000OO0O extends o000OO00 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f58515OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final o0oOO f58516OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(@NotNull FragmentActivity context, long j, long j2) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58515OooOO0O = j2;
        o0oOO o0oooInflate = o0oOO.inflate(LayoutInflater.from(context), this.f58508OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(o0oooInflate, "inflate(...)");
        this.f58516OooOO0o = o0oooInflate;
        o0oooInflate.f44682OooO0o0.setText(String.valueOf(j));
        InputFilter[] inputFilterArr = {new OooO0o(), new InputFilter.LengthFilter(TextFieldImplKt.AnimationDuration)};
        EditText etReason = o0oooInflate.f44679OooO0OO;
        etReason.setFilters(inputFilterArr);
        o0oooInflate.f44681OooO0o.setText(etReason.getText().length() + "/150");
        Intrinsics.checkNotNullExpressionValue(etReason, "etReason");
        etReason.addTextChangedListener(new o000O00O(this));
        o0oooInflate.f44678OooO0O0.setOnClickListener(new OooO0OO(this, 2));
        final o000O0Oo listener = new o000O0Oo(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f58509OooO0o0.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: o0ooo.o000O
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                Function1 listener2 = listener;
                Intrinsics.checkNotNullParameter(listener2, "$listener");
                Intrinsics.checkNotNull(dialogInterface);
                listener2.invoke(dialogInterface);
            }
        });
        o0oooInflate.f44680OooO0Oo.setOnClickListener(new View.OnClickListener() { // from class: o0ooo.o000O00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o000OO0O this$0 = this.f58491OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooO0O0();
            }
        });
    }
}
