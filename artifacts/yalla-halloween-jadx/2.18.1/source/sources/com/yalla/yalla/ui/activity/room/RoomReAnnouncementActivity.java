package com.yalla.yalla.ui.activity.room;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.base.base.activity.BaseActivity;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.RoomReAnnouncementActivity;
import kotlin.jvm.functions.Function0;
import p544o0o0OoOO.s5;
import p544o0o0OoOO.t5;
import p544o0o0OoOO.u5;
import p544o0o0OoOO.v5;

/* JADX INFO: loaded from: classes2.dex */
public class RoomReAnnouncementActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final /* synthetic */ int f22951OooooOO = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RoomConfiguration f22952OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public EditText f22953OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f22954OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ImageView f22955Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public TextView f22956Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public String f22957OooooO0 = "";

    public static void OooOoO(Activity activity, RoomConfiguration roomConfiguration) {
        if (roomConfiguration == null) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) RoomReAnnouncementActivity.class);
        intent.putExtra("Module", roomConfiguration);
        activity.startActivityForResult(intent, 106);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_room_re_announcement);
        if (getIntent() == null) {
            finish();
        } else {
            RoomConfiguration roomConfiguration = (RoomConfiguration) getIntent().getSerializableExtra("Module");
            this.f22952OoooOo0 = roomConfiguration;
            if (roomConfiguration == null) {
                finish();
            }
        }
        this.f11463OoooO.setTitle(R.string.Announcement);
        OooOo0O(0);
        this.f22953OoooOoO = (EditText) findViewById(R.id.activity_room_re_announcement_edit);
        this.f22955Ooooo00 = (ImageView) findViewById(R.id.activity_room_re_announcement_clean);
        this.f22954OoooOoo = (TextView) findViewById(R.id.activity_room_re_announcement_count);
        this.f22955Ooooo00.setVisibility(8);
        this.f22955Ooooo00.setOnClickListener(new s5(this));
        this.f22953OoooOoO.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        this.f22953OoooOoO.setOnEditorActionListener(new t5());
        this.f22953OoooOoO.addTextChangedListener(new u5(this));
        this.f11463OoooO.OooOoO0(new Function0() { // from class: o0o0OoOO.r5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RoomReAnnouncementActivity roomReAnnouncementActivity = this.f44304Oooo0o;
                int i = RoomReAnnouncementActivity.f22951OooooOO;
                roomReAnnouncementActivity.finish();
                return null;
            }
        });
        this.f22956Ooooo0o = this.f11463OoooO.OooOoo(getString(R.string.Save), new v5(this));
        this.f22953OoooOoO.setText(this.f22952OoooOo0.getNotice());
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, p140o00OOOoO.OooO0o
    public final void onEventMainThread(p140o00OOOoO.OooO0OO oooO0OO) {
        super.onEventMainThread(oooO0OO);
        if (oooO0OO.f31885OooO00o == 33) {
            LiveEventBus.get("RoomAnnouncement").post(this.f22957OooooO0);
            ToastUtil.f12567OooO00o.OooO0O0(getResources().getString(R.string.OK));
            finish();
        }
    }
}
