package p256o00ooOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.yldialog.timechoose.DateScrollView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;
import p255o00ooO0o.o00O0O0O;
import p255o00ooO0o.o00O0OO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo00 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f34387OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f34388OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f34389OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final DateScrollView f34390OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final DateScrollView f34391OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final DateScrollView f34392OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f34393OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f34394OooO0oo;

    public o00Oo00(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull DateScrollView dateScrollView, @NonNull DateScrollView dateScrollView2, @NonNull DateScrollView dateScrollView3, @NonNull TextView textView3, @NonNull View view) {
        this.f34387OooO00o = constraintLayout;
        this.f34388OooO0O0 = textView;
        this.f34389OooO0OO = textView2;
        this.f34390OooO0Oo = dateScrollView;
        this.f34392OooO0o0 = dateScrollView2;
        this.f34391OooO0o = dateScrollView3;
        this.f34393OooO0oO = textView3;
        this.f34394OooO0oo = view;
    }

    @NonNull
    public static o00Oo00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f34387OooO00o;
    }

    @NonNull
    public static o00Oo00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(o00O0OO0.day_hour_minute_choose_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o00O0O0O.btnCancel;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, i);
        if (textView != null) {
            i = o00O0O0O.btnConfirm;
            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, i);
            if (textView2 != null) {
                i = o00O0O0O.date_day;
                DateScrollView dateScrollView = (DateScrollView) o00Oo0.OooO00o(viewInflate, i);
                if (dateScrollView != null) {
                    i = o00O0O0O.date_hour;
                    DateScrollView dateScrollView2 = (DateScrollView) o00Oo0.OooO00o(viewInflate, i);
                    if (dateScrollView2 != null) {
                        i = o00O0O0O.date_min;
                        DateScrollView dateScrollView3 = (DateScrollView) o00Oo0.OooO00o(viewInflate, i);
                        if (dateScrollView3 != null) {
                            i = o00O0O0O.tvTitle;
                            TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, i);
                            if (textView3 != null && (viewOooO00o = o00Oo0.OooO00o(viewInflate, (i = o00O0O0O.viewLine))) != null) {
                                return new o00Oo00((ConstraintLayout) viewInflate, textView, textView2, dateScrollView, dateScrollView2, dateScrollView3, textView3, viewOooO00o);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
