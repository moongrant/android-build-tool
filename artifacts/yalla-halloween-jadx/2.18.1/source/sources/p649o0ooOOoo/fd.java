package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class fd implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49363OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49364OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f49365OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f49366OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f49367OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final NetImageView f49368OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final View f49369OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f49370OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f49371OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49372OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f49373OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49374OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49375OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49376OooOOO0;

    public fd(@NonNull LinearLayout linearLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.f49364OooO00o = linearLayout;
        this.f49365OooO0O0 = view;
        this.f49366OooO0OO = view2;
        this.f49367OooO0Oo = view3;
        this.f49369OooO0o0 = view4;
        this.f49368OooO0o = netImageView;
        this.f49370OooO0oO = textView;
        this.f49371OooO0oo = textView2;
        this.f49363OooO = textView3;
        this.f49372OooOO0 = textView4;
        this.f49373OooOO0O = textView5;
        this.f49374OooOO0o = textView6;
        this.f49376OooOOO0 = textView7;
        this.f49375OooOOO = textView8;
    }

    @NonNull
    public static fd inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49364OooO00o;
    }

    @NonNull
    public static fd inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_topic_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bgTopicDesc;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.bgTopicDesc);
        if (viewOooO00o != null) {
            i = R.id.bgTopicHeader;
            View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.bgTopicHeader);
            if (viewOooO00o2 != null) {
                i = R.id.bgTopicName;
                View viewOooO00o3 = o00Oo0.OooO00o(viewInflate, R.id.bgTopicName);
                if (viewOooO00o3 != null) {
                    i = R.id.bgTopicRule;
                    View viewOooO00o4 = o00Oo0.OooO00o(viewInflate, R.id.bgTopicRule);
                    if (viewOooO00o4 != null) {
                        i = R.id.nivTopicHeader;
                        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.nivTopicHeader);
                        if (netImageView != null) {
                            i = R.id.tvTopicDesc;
                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTopicDesc);
                            if (textView != null) {
                                i = R.id.tvTopicName;
                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTopicName);
                                if (textView2 != null) {
                                    i = R.id.tvTopicRule;
                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTopicRule);
                                    if (textView3 != null) {
                                        i = R.id.vTopicBlackList;
                                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.vTopicBlackList);
                                        if (textView4 != null) {
                                            i = R.id.vTopicDesc;
                                            TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.vTopicDesc);
                                            if (textView5 != null) {
                                                i = R.id.vTopicHeader;
                                                TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.vTopicHeader);
                                                if (textView6 != null) {
                                                    i = R.id.vTopicManager;
                                                    TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.vTopicManager);
                                                    if (textView7 != null) {
                                                        i = R.id.vTopicName;
                                                        if (((TextView) o00Oo0.OooO00o(viewInflate, R.id.vTopicName)) != null) {
                                                            i = R.id.vTopicRule;
                                                            TextView textView8 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.vTopicRule);
                                                            if (textView8 != null) {
                                                                return new fd((LinearLayout) viewInflate, viewOooO00o, viewOooO00o2, viewOooO00o3, viewOooO00o4, netImageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
