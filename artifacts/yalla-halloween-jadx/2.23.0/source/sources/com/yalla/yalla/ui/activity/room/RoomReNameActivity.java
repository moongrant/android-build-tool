package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import kotlin.jvm.functions.Function0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public class RoomReNameActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26634OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public EditText f26635OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RoomConfiguration f26636OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public TextView f26637OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public TextView f26638OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public ImageView f26639OooOo00;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_room_re_name);
        if (getIntent() == null) {
            finish();
        } else {
            RoomConfiguration roomConfiguration = (RoomConfiguration) getIntent().getSerializableExtra("Module");
            this.f26636OooOOo0 = roomConfiguration;
            if (roomConfiguration == null) {
                finish();
            }
        }
        this.f22755OooOO0.setTitle(oO00OOo0.Room_name);
        OooOOo0(0);
        this.f26635OooOOo = (EditText) findViewById(oO00O0oO.activity_room_re_name_edit);
        this.f26639OooOo00 = (ImageView) findViewById(oO00O0oO.activity_room_re_name_clean);
        this.f26637OooOOoo = (TextView) findViewById(oO00O0oO.activity_room_re_name_count);
        this.f26639OooOo00.setVisibility(8);
        this.f26639OooOo00.setOnClickListener(new o00O0O00(this));
        this.f26635OooOOo.addTextChangedListener(new o00O0O0(this));
        this.f22755OooOO0.OooOo00(new Function0() { // from class: com.yalla.yalla.ui.activity.room.o00O0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i = RoomReNameActivity.f26634OooOo0O;
                this.f26857OooO0Oo.finish();
                return null;
            }
        });
        this.f26638OooOo0 = this.f22755OooOO0.OooOoO(getString(oO00OOo0.Save), new o00O0O0O(this));
        this.f26635OooOOo.setText(this.f26636OooOOo0.getBarname());
    }
}
