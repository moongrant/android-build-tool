package p544o0o0OoOO;

import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import p502o0o00o0.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d3 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f44219Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f44220Oooo0oO;

    public /* synthetic */ d3(Object obj, int i) {
        this.f44219Oooo0o = i;
        this.f44220Oooo0oO = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44219Oooo0o) {
            case 0:
                CreateRoomActivity this$0 = (CreateRoomActivity) this.f44220Oooo0oO;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22774Ooooooo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f22779Ooooo0o;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                break;
            default:
                o00000O this_apply = (o00000O) this.f44220Oooo0oO;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.OooO0O0();
                break;
        }
    }
}
