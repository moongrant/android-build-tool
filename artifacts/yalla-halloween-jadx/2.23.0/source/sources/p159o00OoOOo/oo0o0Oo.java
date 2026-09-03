package p159o00OoOOo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.yldialog.timechoose.DateScrollView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p157o00OoOO0.o00oO0o;
import p157o00OoOO0.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f38491OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f38492OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f38493OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final DateScrollView f38494OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final DateScrollView f38495OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final DateScrollView f38496OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f38497OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f38498OooO0oo;

    public oo0o0Oo(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull DateScrollView dateScrollView, @NonNull DateScrollView dateScrollView2, @NonNull DateScrollView dateScrollView3, @NonNull TextView textView3, @NonNull View view) {
        this.f38491OooO00o = constraintLayout;
        this.f38492OooO0O0 = textView;
        this.f38493OooO0OO = textView2;
        this.f38494OooO0Oo = dateScrollView;
        this.f38496OooO0o0 = dateScrollView2;
        this.f38495OooO0o = dateScrollView3;
        this.f38497OooO0oO = textView3;
        this.f38498OooO0oo = view;
    }

    @NonNull
    public static oo0o0Oo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f38491OooO00o;
    }

    @NonNull
    public static oo0o0Oo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(o00oO0o.day_hour_minute_choose_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oo000o.btnCancel;
        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
        if (textView != null) {
            i = oo000o.btnConfirm;
            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView2 != null) {
                i = oo000o.date_day;
                DateScrollView dateScrollView = (DateScrollView) OooOO0.OooO00o(i, viewInflate);
                if (dateScrollView != null) {
                    i = oo000o.date_hour;
                    DateScrollView dateScrollView2 = (DateScrollView) OooOO0.OooO00o(i, viewInflate);
                    if (dateScrollView2 != null) {
                        i = oo000o.date_min;
                        DateScrollView dateScrollView3 = (DateScrollView) OooOO0.OooO00o(i, viewInflate);
                        if (dateScrollView3 != null) {
                            i = oo000o.tvTitle;
                            TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView3 != null && (viewOooO00o = OooOO0.OooO00o((i = oo000o.viewLine), viewInflate)) != null) {
                                return new oo0o0Oo((ConstraintLayout) viewInflate, textView, textView2, dateScrollView, dateScrollView2, dateScrollView3, textView3, viewOooO00o);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
