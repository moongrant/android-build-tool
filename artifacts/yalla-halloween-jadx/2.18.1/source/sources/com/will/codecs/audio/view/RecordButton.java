package com.will.codecs.audio.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.weieyu.yalla.R;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p455o0Ooo00.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public class RecordButton extends Button {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public volatile int f20261Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Dialog f20262Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO0O0 f20263Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public volatile OooO0o f20264Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public float f20265OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public volatile double f20266OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public volatile float f20267OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public volatile boolean f20268OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public TextView f20269OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Context f20270OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public String f20271OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f20272OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public ExecutorService f20273OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public OooO00o f20274OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public ImageView f20275o000oOoO;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    RecordButton.this.f20262Oooo0o.dismiss();
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    if (RecordButton.this.f20262Oooo0o.isShowing()) {
                        RecordButton.this.f20262Oooo0o.dismiss();
                    }
                    RecordButton.this.setText("按住 说话");
                    return;
                }
            }
            RecordButton recordButton = RecordButton.this;
            if (recordButton.f20266OoooO0 < 600.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.fragment_close_exit);
                return;
            }
            if (recordButton.f20266OoooO0 > 600.0d && recordButton.f20266OoooO0 < 1000.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.fragment_fade_enter);
                return;
            }
            if (recordButton.f20266OoooO0 > 1000.0d && recordButton.f20266OoooO0 < 1200.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.fragment_fade_exit);
                return;
            }
            if (recordButton.f20266OoooO0 > 1200.0d && recordButton.f20266OoooO0 < 1400.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.fragment_open_enter);
                return;
            }
            if (recordButton.f20266OoooO0 > 1400.0d && recordButton.f20266OoooO0 < 1600.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.fragment_open_exit);
                return;
            }
            if (recordButton.f20266OoooO0 > 1600.0d && recordButton.f20266OoooO0 < 1800.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.linear_indeterminate_line1_head_interpolator);
                return;
            }
            if (recordButton.f20266OoooO0 > 1800.0d && recordButton.f20266OoooO0 < 2000.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.linear_indeterminate_line1_tail_interpolator);
                return;
            }
            if (recordButton.f20266OoooO0 > 2000.0d && recordButton.f20266OoooO0 < 3000.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.linear_indeterminate_line2_head_interpolator);
                return;
            }
            if (recordButton.f20266OoooO0 > 3000.0d && recordButton.f20266OoooO0 < 4000.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.linear_indeterminate_line2_tail_interpolator);
                return;
            }
            if (recordButton.f20266OoooO0 > 4000.0d && recordButton.f20266OoooO0 < 6000.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.m3_btn_elevated_btn_state_list_anim);
                return;
            }
            if (recordButton.f20266OoooO0 > 6000.0d && recordButton.f20266OoooO0 < 8000.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.m3_btn_state_list_anim);
                return;
            }
            if (recordButton.f20266OoooO0 > 8000.0d && recordButton.f20266OoooO0 < 10000.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.m3_card_elevated_state_list_anim);
                return;
            }
            if (recordButton.f20266OoooO0 > 10000.0d && recordButton.f20266OoooO0 < 12000.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.m3_card_state_list_anim);
            } else if (recordButton.f20266OoooO0 > 12000.0d) {
                recordButton.f20275o000oOoO.setImageResource(R.animator.m3_chip_state_list_anim);
            }
        }
    }

    public interface OooO0O0 {
        void OooO00o();

        void OooO0O0();
    }

    public RecordButton(Context context) {
        super(context);
        this.f20261Oooo = 0;
        this.f20267OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f20266OoooO0 = 0.0d;
        this.f20268OoooO0O = false;
        this.f20272OoooOo0 = 60;
        this.f20273OoooOoO = Executors.newFixedThreadPool(1);
        this.f20274OoooOoo = new OooO00o();
        OooO00o(context);
    }

    public final void OooO00o(Context context) {
        this.f20270OoooOOO = context;
        setText("按住 说话");
    }

    public final void OooO0O0(int i) {
        if (this.f20262Oooo0o == null) {
            Dialog dialog = new Dialog(this.f20270OoooOOO, R.bool.enable_system_alarm_service_default);
            this.f20262Oooo0o = dialog;
            dialog.setContentView(R.array.anim_room_bottom_gift);
            this.f20275o000oOoO = (ImageView) this.f20262Oooo0o.findViewById(R.dimen.abc_action_bar_default_padding_start_material);
            this.f20269OoooOO0 = (TextView) this.f20262Oooo0o.findViewById(R.dimen.abc_action_bar_elevation_material);
        }
        if (i != 1) {
            this.f20275o000oOoO.setImageResource(R.animator.fragment_close_exit);
            this.f20269OoooOO0.setText("向上滑动可取消录音");
            setText("松开手指 完成录音");
        } else {
            this.f20275o000oOoO.setImageResource(R.animator.mtrl_btn_state_list_anim);
            this.f20269OoooOO0.setText("松开手指可取消录音");
            setText("松开手指 取消录音");
        }
        this.f20269OoooOO0.setTextSize(14.0f);
        this.f20262Oooo0o.show();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y = motionEvent.getY();
                    if (this.f20261Oooo == 1) {
                        if (this.f20265OoooO - y > 50.0f) {
                            this.f20268OoooO0O = true;
                            OooO0O0(1);
                        }
                        if (this.f20265OoooO - y < 20.0f) {
                            this.f20268OoooO0O = false;
                            OooO0O0(0);
                        }
                    }
                } else if (action == 3) {
                    if (this.f20262Oooo0o.isShowing()) {
                        this.f20262Oooo0o.dismiss();
                    }
                    setText("按住 说话");
                    this.f20261Oooo = 0;
                    this.f20268OoooO0O = false;
                }
            } else if (this.f20261Oooo == 1) {
                this.f20261Oooo = 0;
                if (this.f20262Oooo0o.isShowing()) {
                    this.f20262Oooo0o.dismiss();
                }
                try {
                    this.f20264Oooo0oo.stop();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f20266OoooO0 = 0.0d;
                if (this.f20268OoooO0O) {
                    this.f20264Oooo0oo.OooO0OO();
                } else if (this.f20267OoooO00 < 1.0f) {
                    Toast toast = new Toast(this.f20270OoooOOO);
                    toast.setView(LayoutInflater.from(this.f20270OoooOOO).inflate(R.array.anim_room_hook, (ViewGroup) null));
                    toast.setGravity(17, 0, 0);
                    toast.show();
                    this.f20264Oooo0oo.OooO0OO();
                } else {
                    OooO0O0 oooO0O0 = this.f20263Oooo0oO;
                    if (oooO0O0 != null) {
                        this.f20264Oooo0oo.OooO0O0();
                        oooO0O0.OooO00o();
                    }
                }
                this.f20268OoooO0O = false;
                setText("按住 说话");
            } else {
                if (this.f20262Oooo0o.isShowing()) {
                    this.f20262Oooo0o.dismiss();
                }
                setText("按住 说话");
                this.f20268OoooO0O = false;
            }
        } else if (this.f20261Oooo != 1) {
            OooO0O0 oooO0O1 = this.f20263Oooo0oO;
            if (oooO0O1 != null) {
                oooO0O1.OooO0O0();
            }
            OooO0O0(0);
            this.f20265OoooO = motionEvent.getY();
            if (this.f20264Oooo0oo != null) {
                this.f20264Oooo0oo.OooO00o();
                this.f20261Oooo = 1;
                try {
                    this.f20264Oooo0oo.OooO0o0(String.valueOf(this.f20271OoooOOo) + File.separator + UUID.randomUUID().toString() + ".aac");
                    this.f20264Oooo0oo.start();
                    this.f20273OoooOoO.execute(new com.will.codecs.audio.view.OooO00o(this));
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        } else {
            this.f20274OoooOoo.obtainMessage(3).sendToTarget();
        }
        return true;
    }

    public void setAudioRecord(OooO0o oooO0o) {
        this.f20264Oooo0oo = oooO0o;
    }

    public void setRecordListener(OooO0O0 oooO0O0) {
        this.f20263Oooo0oO = oooO0O0;
    }

    public void setRecordMaxTime(int i) {
        this.f20272OoooOo0 = i;
    }

    public void setVoiceDir(String str) {
        this.f20271OoooOOo = str;
    }

    public RecordButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20261Oooo = 0;
        this.f20267OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f20266OoooO0 = 0.0d;
        this.f20268OoooO0O = false;
        this.f20272OoooOo0 = 60;
        this.f20273OoooOoO = Executors.newFixedThreadPool(1);
        this.f20274OoooOoo = new OooO00o();
        OooO00o(context);
    }

    public RecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20261Oooo = 0;
        this.f20267OoooO00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f20266OoooO0 = 0.0d;
        this.f20268OoooO0O = false;
        this.f20272OoooOo0 = 60;
        this.f20273OoooOoO = Executors.newFixedThreadPool(1);
        this.f20274OoooOoo = new OooO00o();
        OooO00o(context);
    }
}
