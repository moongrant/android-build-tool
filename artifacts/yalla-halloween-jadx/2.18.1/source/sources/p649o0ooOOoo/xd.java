package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.view.FixTextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class xd implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50968OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50969OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FixTextView f50970OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50971OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final View f50972OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f50973OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final View f50974OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f50975OooO0oo;

    public xd(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull FixTextView fixTextView, @NonNull TextView textView, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4) {
        this.f50968OooO00o = constraintLayout;
        this.f50969OooO0O0 = netImageView;
        this.f50970OooO0OO = fixTextView;
        this.f50971OooO0Oo = textView;
        this.f50973OooO0o0 = view;
        this.f50972OooO0o = view2;
        this.f50974OooO0oO = view3;
        this.f50975OooO0oo = view4;
    }

    @NonNull
    public static xd OooO00o(@NonNull View view) {
        int i = R.id.ivCamera;
        if (((ImageView) o00Oo0.OooO00o(view, R.id.ivCamera)) != null) {
            i = R.id.nivTopicHeader;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(view, R.id.nivTopicHeader);
            if (netImageView != null) {
                i = R.id.tvIntroduction;
                FixTextView fixTextView = (FixTextView) o00Oo0.OooO00o(view, R.id.tvIntroduction);
                if (fixTextView != null) {
                    i = R.id.tvIntroductionTitle;
                    if (((TextView) o00Oo0.OooO00o(view, R.id.tvIntroductionTitle)) != null) {
                        i = R.id.tvName;
                        TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvName);
                        if (textView != null) {
                            i = R.id.tvNameTitle;
                            if (((TextView) o00Oo0.OooO00o(view, R.id.tvNameTitle)) != null) {
                                i = R.id.tvNote1;
                                if (((TextView) o00Oo0.OooO00o(view, R.id.tvNote1)) != null) {
                                    i = R.id.tvNote2;
                                    if (((TextView) o00Oo0.OooO00o(view, R.id.tvNote2)) != null) {
                                        i = R.id.tvNote3;
                                        if (((TextView) o00Oo0.OooO00o(view, R.id.tvNote3)) != null) {
                                            i = R.id.tvNote4;
                                            if (((TextView) o00Oo0.OooO00o(view, R.id.tvNote4)) != null) {
                                                i = R.id.tvNote5;
                                                if (((TextView) o00Oo0.OooO00o(view, R.id.tvNote5)) != null) {
                                                    i = R.id.tvNoteTitle;
                                                    if (((TextView) o00Oo0.OooO00o(view, R.id.tvNoteTitle)) != null) {
                                                        i = R.id.vIntroduction;
                                                        View viewOooO00o = o00Oo0.OooO00o(view, R.id.vIntroduction);
                                                        if (viewOooO00o != null) {
                                                            i = R.id.vLine;
                                                            View viewOooO00o2 = o00Oo0.OooO00o(view, R.id.vLine);
                                                            if (viewOooO00o2 != null) {
                                                                i = R.id.vName;
                                                                View viewOooO00o3 = o00Oo0.OooO00o(view, R.id.vName);
                                                                if (viewOooO00o3 != null) {
                                                                    i = R.id.vNote;
                                                                    View viewOooO00o4 = o00Oo0.OooO00o(view, R.id.vNote);
                                                                    if (viewOooO00o4 != null) {
                                                                        return new xd((ConstraintLayout) view, netImageView, fixTextView, textView, viewOooO00o, viewOooO00o2, viewOooO00o3, viewOooO00o4);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static xd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50968OooO00o;
    }

    @NonNull
    public static xd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_layout_topic_create, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
