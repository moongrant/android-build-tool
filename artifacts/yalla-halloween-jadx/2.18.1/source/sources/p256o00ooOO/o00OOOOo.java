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
public final class o00OOOOo implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f34380OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f34381OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f34382OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final DateScrollView f34383OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final DateScrollView f34384OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final DateScrollView f34385OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f34386OooO0oO;

    public o00OOOOo(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull DateScrollView dateScrollView, @NonNull DateScrollView dateScrollView2, @NonNull DateScrollView dateScrollView3, @NonNull View view) {
        this.f34380OooO00o = constraintLayout;
        this.f34381OooO0O0 = textView;
        this.f34382OooO0OO = textView2;
        this.f34383OooO0Oo = dateScrollView;
        this.f34385OooO0o0 = dateScrollView2;
        this.f34384OooO0o = dateScrollView3;
        this.f34386OooO0oO = view;
    }

    @NonNull
    public static o00OOOOo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f34380OooO00o;
    }

    @NonNull
    public static o00OOOOo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(o00O0OO0.choose_interval_time_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o00O0O0O.btnCancel;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, i);
        if (textView != null) {
            i = o00O0O0O.btnConfirm;
            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, i);
            if (textView2 != null) {
                i = o00O0O0O.dateDays;
                DateScrollView dateScrollView = (DateScrollView) o00Oo0.OooO00o(viewInflate, i);
                if (dateScrollView != null) {
                    i = o00O0O0O.dateHours;
                    DateScrollView dateScrollView2 = (DateScrollView) o00Oo0.OooO00o(viewInflate, i);
                    if (dateScrollView2 != null) {
                        i = o00O0O0O.dateMin;
                        DateScrollView dateScrollView3 = (DateScrollView) o00Oo0.OooO00o(viewInflate, i);
                        if (dateScrollView3 != null && (viewOooO00o = o00Oo0.OooO00o(viewInflate, (i = o00O0O0O.viewLine))) != null) {
                            return new o00OOOOo((ConstraintLayout) viewInflate, textView, textView2, dateScrollView, dateScrollView2, dateScrollView3, viewOooO00o);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
