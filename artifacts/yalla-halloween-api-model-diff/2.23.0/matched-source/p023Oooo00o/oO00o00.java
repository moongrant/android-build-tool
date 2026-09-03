package p023Oooo00o;

import android.content.Context;
import com.google.android.material.datepicker.OooO0o;
import com.google.android.material.datepicker.o0000;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Date;
import kotlin.text.Typography;
import p270o0O0000o.o0000O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO00o00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f972OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f973OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f974OooO0o0;

    public /* synthetic */ oO00o00(int i, String str, Object obj) {
        this.f972OooO0Oo = i;
        this.f973OooO0o = obj;
        this.f974OooO0o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f972OooO0Oo;
        String str = this.f974OooO0o0;
        Object obj = this.f973OooO0o;
        switch (i) {
            case 0:
                ((oO0OOO00.OooO00o) obj).f985OooO0O0.onCameraAvailable(str);
                break;
            default:
                OooO0o oooO0o = (OooO0o) obj;
                TextInputLayout textInputLayout = oooO0o.f16887OooO0Oo;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(o0000O0.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(o0000O0.mtrl_picker_invalid_format_use), str.replace(' ', Typography.nbsp)) + "\n" + String.format(context.getString(o0000O0.mtrl_picker_invalid_format_example), oooO0o.f16889OooO0o0.format(new Date(o0000.OooO0oo().getTimeInMillis())).replace(' ', Typography.nbsp)));
                oooO0o.OooO00o();
                break;
        }
    }
}
