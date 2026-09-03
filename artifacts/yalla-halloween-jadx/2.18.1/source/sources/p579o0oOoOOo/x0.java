package p579o0oOoOOo;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p654o0ooo.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends Dialog implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public NetImageView f46354Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public FragmentActivity f46355Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Window f46356Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public ImageView f46357Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public TextView f46358OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public TextView f46359OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f46360OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public TextView f46361OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f46362OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public o000oOoO f46363OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public o000oOoO f46364o000oOoO;

    public x0(Context context) {
        super(context);
        this.f46355Oooo0o = (FragmentActivity) context;
        Window window = getWindow();
        this.f46356Oooo0oO = window;
        window.setWindowAnimations(R.style.anim_bottom_top_bottom);
        this.f46356Oooo0oO.requestFeature(1);
        this.f46356Oooo0oO.setContentView(R.layout.dialog_subscription_member);
        this.f46356Oooo0oO.setBackgroundDrawableResource(R.color.transparent);
        this.f46356Oooo0oO.setDimAmount(0.3f);
        this.f46356Oooo0oO.setGravity(80);
        WindowManager.LayoutParams attributes = this.f46356Oooo0oO.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        this.f46356Oooo0oO.setAttributes(attributes);
        setCanceledOnTouchOutside(true);
        this.f46357Oooo0oo = (ImageView) this.f46356Oooo0oO.findViewById(R.id.dialog_subscription_member_iv_close);
        this.f46354Oooo = (NetImageView) this.f46356Oooo0oO.findViewById(R.id.dialog_subscription_member_header);
        this.f46360OoooO00 = (TextView) this.f46356Oooo0oO.findViewById(R.id.dialog_subscription_member_tv_purchase);
        this.f46359OoooO0 = (TextView) this.f46356Oooo0oO.findViewById(R.id.dialog_subscription_member_tv_name);
        this.f46361OoooO0O = (TextView) this.f46356Oooo0oO.findViewById(R.id.dialog_subscription_member_tv_info);
        this.f46358OoooO = (TextView) this.f46356Oooo0oO.findViewById(R.id.dialog_subscription_member_tv_subscribe_now);
        this.f46362OoooOO0 = (TextView) this.f46356Oooo0oO.findViewById(R.id.dialog_subscription_member_tv_instructions_content);
        this.f46357Oooo0oo.setOnClickListener(this);
        this.f46360OoooO00.setOnClickListener(this);
        this.f46358OoooO.setOnClickListener(this);
        try {
            getWindow().getDecorView().setSystemUiVisibility(4866);
        } catch (Exception unused) {
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.dialog_subscription_member_iv_close) {
            dismiss();
            return;
        }
        if (id == R.id.dialog_subscription_member_tv_purchase) {
            o000oOoO o000oooo2 = this.f46364o000oOoO;
            if (o000oooo2 != null) {
                o000oooo2.OooO0Oo();
            }
            dismiss();
            return;
        }
        if (id == R.id.dialog_subscription_member_tv_subscribe_now) {
            o000oOoO o000oooo3 = this.f46363OoooOOO;
            if (o000oooo3 != null) {
                o000oooo3.OooO0Oo();
            }
            dismiss();
        }
    }
}
