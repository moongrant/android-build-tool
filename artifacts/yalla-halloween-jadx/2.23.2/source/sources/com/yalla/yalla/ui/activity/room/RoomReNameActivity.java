package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomReNameActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26180OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public EditText f26181OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RoomConfiguration f26182OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f26183OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public TextView f26184OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ImageView f26185OooOo00;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_room_re_name);
        if (getIntent() == null) {
            finish();
        } else {
            RoomConfiguration roomConfiguration = (RoomConfiguration) getIntent().getSerializableExtra("Module");
            this.f26182OooOOo0 = roomConfiguration;
            if (roomConfiguration == null) {
                finish();
            }
        }
        this.f22282OooOO0.setTitle(p562o0oOo000.o000000.Room_name);
        OooOOo0(0);
        this.f26181OooOOo = (EditText) findViewById(p562o0oOo000.o0OO00O.activity_room_re_name_edit);
        this.f26185OooOo00 = (ImageView) findViewById(p562o0oOo000.o0OO00O.activity_room_re_name_clean);
        this.f26183OooOOoo = (TextView) findViewById(p562o0oOo000.o0OO00O.activity_room_re_name_count);
        this.f26185OooOo00.setVisibility(8);
        this.f26185OooOo00.setOnClickListener(new o00O00o0(this));
        this.f26181OooOOo.addTextChangedListener(new oo00o(this));
        this.f22282OooOO0.OooOo00(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o00O00OO
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = RoomReNameActivity.f26180OooOo0O;
                this.f26408OooO0Oo.finish();
                return null;
            }
        });
        this.f26184OooOo0 = this.f22282OooOO0.OooOoO(getString(p562o0oOo000.o000000.Save), new o00O0(this));
        this.f26181OooOOo.setText(this.f26182OooOOo0.getBarname());
    }
}
