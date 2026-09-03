package com.yalla.yalla.ui.activity.room;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.base.base.activity.BaseActivity;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.RoomReNameActivity;
import kotlin.jvm.functions.Function0;
import p544o0o0OoOO.x5;
import p544o0o0OoOO.y5;
import p544o0o0OoOO.z5;

/* JADX INFO: loaded from: classes2.dex */
public class RoomReNameActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f22958OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RoomConfiguration f22959OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public EditText f22960OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f22961OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ImageView f22962Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public TextView f22963Ooooo0o;

    public static void OooOoO(Activity activity, RoomConfiguration roomConfiguration) {
        if (roomConfiguration == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) RoomReNameActivity.class);
        intent.putExtra("Module", roomConfiguration);
        activity.startActivityForResult(intent, 105);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_room_re_name);
        if (getIntent() == null) {
            finish();
        } else {
            RoomConfiguration roomConfiguration = (RoomConfiguration) getIntent().getSerializableExtra("Module");
            this.f22959OoooOo0 = roomConfiguration;
            if (roomConfiguration == null) {
                finish();
            }
        }
        this.f11463OoooO.setTitle(R.string.Room_name);
        OooOo0O(0);
        this.f22960OoooOoO = (EditText) findViewById(R.id.activity_room_re_name_edit);
        this.f22962Ooooo00 = (ImageView) findViewById(R.id.activity_room_re_name_clean);
        this.f22961OoooOoo = (TextView) findViewById(R.id.activity_room_re_name_count);
        this.f22962Ooooo00.setVisibility(8);
        this.f22962Ooooo00.setOnClickListener(new x5(this));
        this.f22960OoooOoO.addTextChangedListener(new y5(this));
        this.f11463OoooO.OooOoO0(new Function0() { // from class: o0o0OoOO.w5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RoomReNameActivity roomReNameActivity = this.f44336Oooo0o;
                int i = RoomReNameActivity.f22958OooooO0;
                roomReNameActivity.finish();
                return null;
            }
        });
        this.f22963Ooooo0o = this.f11463OoooO.OooOoo(getString(R.string.Save), new z5(this));
        this.f22960OoooOoO.setText(this.f22959OoooOo0.getBarname());
    }
}
