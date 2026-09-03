package p181o00o000;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.app.base.framework.abs.AbsListener.AbsListenerTag;
import com.weieyu.yalla.R;
import p142o00OOooO.OooOOO;
import p147o00Oo00o.o0OO00O;
import p147o00Oo00o.oo0o0Oo;
import p148o00Oo0O.o00Oo0;
import p172o00OooO.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends oo0o0Oo<String, AbsListenerTag> {

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public View f32946OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public EditText f32947OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public ImageView f32948OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public View f32949OoooOO0;

    public OooO(Activity activity) {
        super(activity, R.id.search);
    }

    @Override // p147o00Oo00o.oo0o0Oo
    public final void OooO0O0() {
        EditText editText = this.f32947OoooO0;
        if (editText != null) {
            editText.setText("");
            this.f32947OoooO0.setHint("");
        }
        ImageView imageView = this.f32948OoooO0O;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // p147o00Oo00o.oo0o0Oo
    public final void OooO0OO() {
        this.f32947OoooO0 = (EditText) OooO00o(R.id.include_search_edittext_searchEdit);
        View view = this.f32161Oooo0o;
        if (this.f32164OoooO00 == null) {
            this.f32164OoooO00 = new o0OO00O(this);
        }
        this.f32948OoooO0O = (ImageView) o00Oo0.OooO00o(view, R.id.include_search_edittext_iv_clear, this.f32164OoooO00);
        this.f32946OoooO = OooO00o(R.id.include_search_edittext_line_edit);
        this.f32949OoooOO0 = OooO00o(R.id.include_search_edittext_line_bottom);
        o00O0O0.OooO0O0().OooO0OO(this.f32947OoooO0, new OooOOO(this, 2));
    }

    @Override // o00Oo00.OooO00o
    public final void onClickNotDouble(View view) {
        if (view.getId() == R.id.include_search_edittext_iv_clear) {
            this.f32947OoooO0.setText("");
        }
    }
}
