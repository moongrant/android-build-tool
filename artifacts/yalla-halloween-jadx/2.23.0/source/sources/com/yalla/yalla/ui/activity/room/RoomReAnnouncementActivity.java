package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.os.Looper;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomReAnnouncementActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26628OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public TextView f26629OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public EditText f26630OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ImageView f26631OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public String f26632OooOo0 = "";

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public TextView f26633OooOo00;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_room_re_announcement);
        if (getIntent() == null || ((RoomConfiguration) getIntent().getSerializableExtra("Module")) == null) {
            finish();
        }
        this.f22755OooOO0.setTitle(oO00OOo0.Announcement);
        OooOOo0(0);
        this.f26630OooOOo0 = (EditText) findViewById(oO00O0oO.activity_room_re_announcement_edit);
        this.f26631OooOOoo = (ImageView) findViewById(oO00O0oO.activity_room_re_announcement_clean);
        this.f26629OooOOo = (TextView) findViewById(oO00O0oO.activity_room_re_announcement_count);
        this.f26631OooOOoo.setVisibility(8);
        this.f26631OooOOoo.setOnClickListener(new oOO00O(this));
        this.f26630OooOOo0.setFilters(new InputFilter[]{new InputFilter.LengthFilter(100)});
        this.f26630OooOOo0.setOnEditorActionListener(new o00O00OO());
        this.f26630OooOOo0.addTextChangedListener(new o00O00o0(this));
        this.f22755OooOO0.OooOo00(new o00O00O(this, 0));
        this.f26633OooOo00 = this.f22755OooOO0.OooOoO(getString(oO00OOo0.Save), new oo00o(this));
        this.f26630OooOOo0.setText(com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47490OooO0o.getValue());
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p418o0OoO000.Oooo000
    public final void onEventMainThread(p418o0OoO000.OooOo oooOo) {
        super.onEventMainThread(oooOo);
        if (oooOo.f45532OooO00o == 33) {
            LiveEventBus.get("RoomAnnouncement").post(this.f26632OooOo0);
            String string = getResources().getString(oO00OOo0.OK);
            if (!(string == null || StringsKt.isBlank(string))) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                }
            }
            finish();
        }
    }
}
