package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.view.FacePanelView;
import com.weieyu.yalla.R;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class cc implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49091OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f49092OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final f7 f49093OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FacePanelView f49094OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49095OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ic f49096OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final hc f49097OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final jc f49098OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final kc f49099OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49100OooOO0;

    public cc(@NonNull FrameLayout frameLayout, @NonNull f7 f7Var, @NonNull FacePanelView facePanelView, @NonNull LinearLayout linearLayout, @NonNull hc hcVar, @NonNull ic icVar, @NonNull jc jcVar, @NonNull kc kcVar, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.f49092OooO00o = frameLayout;
        this.f49093OooO0O0 = f7Var;
        this.f49094OooO0OO = facePanelView;
        this.f49095OooO0Oo = linearLayout;
        this.f49097OooO0o0 = hcVar;
        this.f49096OooO0o = icVar;
        this.f49098OooO0oO = jcVar;
        this.f49099OooO0oo = kcVar;
        this.f49091OooO = recyclerView;
        this.f49100OooOO0 = textView;
    }

    @NonNull
    public static cc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49092OooO00o;
    }

    @NonNull
    public static cc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.message_fragment_private_chat, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.base_header_layout;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.base_header_layout);
        if (viewOooO00o != null) {
            f7 f7VarOooO00o = f7.OooO00o(viewOooO00o);
            i = R.id.facePanelView;
            FacePanelView facePanelView = (FacePanelView) o00Oo0.OooO00o(viewInflate, R.id.facePanelView);
            if (facePanelView != null) {
                i = R.id.flChat;
                if (((FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flChat)) != null) {
                    i = R.id.ivYallaChat;
                    if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivYallaChat)) != null) {
                        i = R.id.layoutYallaChat;
                        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutYallaChat);
                        if (linearLayout != null) {
                            i = R.id.llChatRoot;
                            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llChatRoot)) != null) {
                                i = R.id.message_layout_chat_control;
                                View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.message_layout_chat_control);
                                if (viewOooO00o2 != null) {
                                    hc hcVarOooO00o = hc.OooO00o(viewOooO00o2);
                                    i = R.id.message_layout_chat_in_room_tips;
                                    View viewOooO00o3 = o00Oo0.OooO00o(viewInflate, R.id.message_layout_chat_in_room_tips);
                                    if (viewOooO00o3 != null) {
                                        ic icVarOooO00o = ic.OooO00o(viewOooO00o3);
                                        i = R.id.message_layout_chat_voice;
                                        View viewOooO00o4 = o00Oo0.OooO00o(viewInflate, R.id.message_layout_chat_voice);
                                        if (viewOooO00o4 != null) {
                                            jc jcVarOooO00o = jc.OooO00o(viewOooO00o4);
                                            i = R.id.message_layout_chat_warn_tips;
                                            View viewOooO00o5 = o00Oo0.OooO00o(viewInflate, R.id.message_layout_chat_warn_tips);
                                            if (viewOooO00o5 != null) {
                                                kc kcVarOooO00o = kc.OooO00o(viewOooO00o5);
                                                i = R.id.panelLayout;
                                                if (((PanelLayout) o00Oo0.OooO00o(viewInflate, R.id.panelLayout)) != null) {
                                                    i = R.id.rvChat;
                                                    RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvChat);
                                                    if (recyclerView != null) {
                                                        i = R.id.tvYallaChat;
                                                        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvYallaChat);
                                                        if (textView != null) {
                                                            return new cc((FrameLayout) viewInflate, f7VarOooO00o, facePanelView, linearLayout, hcVarOooO00o, icVarOooO00o, jcVarOooO00o, kcVarOooO00o, recyclerView, textView);
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
