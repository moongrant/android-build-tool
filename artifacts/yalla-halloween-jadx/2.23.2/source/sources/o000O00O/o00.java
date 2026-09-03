package o000O00O;

import android.content.Context;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Date;
import kotlin.text.Typography;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f33999OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f34000OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f34001OooO0o0;

    public /* synthetic */ o00(int i, Object obj, Object obj2) {
        this.f33999OooO0Oo = i;
        this.f34001OooO0o0 = obj;
        this.f34000OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f33999OooO0Oo;
        Object obj = this.f34000OooO0o;
        Object obj2 = this.f34001OooO0o0;
        switch (i) {
            case 0:
                androidx.media3.exoplayer.OooOOO oooOOO = (androidx.media3.exoplayer.OooOOO) obj;
                ((androidx.media3.exoplayer.OooOO0O) obj2).getClass();
                try {
                    synchronized (oooOOO) {
                    }
                    try {
                        oooOOO.f7299OooO00o.OooOO0o(oooOOO.f7302OooO0Oo, oooOOO.f7304OooO0o0);
                        return;
                    } finally {
                        oooOOO.OooO0O0(true);
                    }
                } catch (ExoPlaybackException e) {
                    Log.OooO0Oo("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            default:
                com.google.android.material.datepicker.OooO0o oooO0o = (com.google.android.material.datepicker.OooO0o) obj2;
                TextInputLayout textInputLayout = oooO0o.f16414OooO0Oo;
                Context context = textInputLayout.getContext();
                textInputLayout.setError(context.getString(p272o0O0000o.o0000O0.mtrl_picker_invalid_format) + "\n" + String.format(context.getString(p272o0O0000o.o0000O0.mtrl_picker_invalid_format_use), ((String) obj).replace(' ', Typography.nbsp)) + "\n" + String.format(context.getString(p272o0O0000o.o0000O0.mtrl_picker_invalid_format_example), oooO0o.f16416OooO0o0.format(new Date(com.google.android.material.datepicker.o0000.OooO0oo().getTimeInMillis())).replace(' ', Typography.nbsp)));
                oooO0o.OooO00o();
                return;
        }
    }
}
