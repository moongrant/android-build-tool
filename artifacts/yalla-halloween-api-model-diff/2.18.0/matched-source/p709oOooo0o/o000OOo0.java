package p709oOooo0o;

import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.app.base.dialog.OtherLoginType;
import com.weieyu.yalla.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p504o0o00o0.o0000oo;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class o000OOo0 extends o0000oo {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo0(@NotNull FragmentActivity context, boolean z) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewFindViewById = findViewById(R.id.tvFacebook);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tvFacebook)");
        View viewFindViewById2 = findViewById(R.id.tvYallaChat);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tvYallaChat)");
        View viewFindViewById3 = findViewById(R.id.tvTwitter);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.tvTwitter)");
        View viewFindViewById4 = findViewById(R.id.tvWeChat);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.tvWeChat)");
        TextView textView = (TextView) viewFindViewById4;
        this.f41599OoooOO0.setGravity(80);
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(80);
        ((TextView) viewFindViewById).setOnClickListener(this);
        ((TextView) viewFindViewById2).setOnClickListener(this);
        ((TextView) viewFindViewById3).setOnClickListener(this);
        textView.setOnClickListener(this);
        if (!z) {
            textView.setVisibility(8);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setWindowAnimations(R.style.anim_bottom_top_bottom);
        }
    }

    @Override // p504o0o00o0.o0000oo
    public final int OooO00o() {
        return R.layout.dialog_other_login;
    }

    @Override // p504o0o00o0.o0000oo
    public final void OooO0OO(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        switch (view.getId()) {
            case R.id.tvFacebook /* 2131299437 */:
                OooO0Oo(OtherLoginType.Facebook);
                break;
            case R.id.tvTwitter /* 2131299727 */:
                OooO0Oo(OtherLoginType.Twitter);
                break;
            case R.id.tvWeChat /* 2131299758 */:
                OooO0Oo(OtherLoginType.WeChat);
                break;
            case R.id.tvYallaChat /* 2131299769 */:
                OooO0Oo(OtherLoginType.YallaChat);
                break;
        }
    }

    public abstract void OooO0Oo(@NotNull OtherLoginType otherLoginType);
}
