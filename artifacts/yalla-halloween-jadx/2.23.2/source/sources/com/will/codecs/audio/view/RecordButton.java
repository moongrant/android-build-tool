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
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p360o0OOOooO.o000000O;

/* JADX INFO: loaded from: classes2.dex */
public class RecordButton extends Button {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile boolean f22003OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Dialog f22004OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile int f22005OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile o000000O f22006OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile float f22007OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public volatile double f22008OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f22009OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public TextView f22010OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public ImageView f22011OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f22012OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Context f22013OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f22014OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final ExecutorService f22015OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final OooO00o f22016OooOOo0;

    public class OooO00o extends Handler {
        public OooO00o() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    RecordButton.this.f22004OooO0Oo.dismiss();
                    return;
                } else {
                    if (i != 3) {
                        return;
                    }
                    if (RecordButton.this.f22004OooO0Oo.isShowing()) {
                        RecordButton.this.f22004OooO0Oo.dismiss();
                    }
                    RecordButton.this.setText("按住 说话");
                    return;
                }
            }
            RecordButton recordButton = RecordButton.this;
            if (recordButton.f22008OooO0oo < 600.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.fragment_close_exit);
                return;
            }
            if (recordButton.f22008OooO0oo > 600.0d && recordButton.f22008OooO0oo < 1000.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.fragment_fade_enter);
                return;
            }
            if (recordButton.f22008OooO0oo > 1000.0d && recordButton.f22008OooO0oo < 1200.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.fragment_fade_exit);
                return;
            }
            if (recordButton.f22008OooO0oo > 1200.0d && recordButton.f22008OooO0oo < 1400.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.fragment_open_enter);
                return;
            }
            if (recordButton.f22008OooO0oo > 1400.0d && recordButton.f22008OooO0oo < 1600.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.fragment_open_exit);
                return;
            }
            if (recordButton.f22008OooO0oo > 1600.0d && recordButton.f22008OooO0oo < 1800.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.m3_appbar_state_list_animator);
                return;
            }
            if (recordButton.f22008OooO0oo > 1800.0d && recordButton.f22008OooO0oo < 2000.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.m3_btn_elevated_btn_state_list_anim);
                return;
            }
            if (recordButton.f22008OooO0oo > 2000.0d && recordButton.f22008OooO0oo < 3000.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.m3_btn_state_list_anim);
                return;
            }
            if (recordButton.f22008OooO0oo > 3000.0d && recordButton.f22008OooO0oo < 4000.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.m3_card_elevated_state_list_anim);
                return;
            }
            if (recordButton.f22008OooO0oo > 4000.0d && recordButton.f22008OooO0oo < 6000.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.m3_card_state_list_anim);
                return;
            }
            if (recordButton.f22008OooO0oo > 6000.0d && recordButton.f22008OooO0oo < 8000.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.m3_chip_state_list_anim);
                return;
            }
            if (recordButton.f22008OooO0oo > 8000.0d && recordButton.f22008OooO0oo < 10000.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.m3_elevated_chip_state_list_anim);
                return;
            }
            if (recordButton.f22008OooO0oo > 10000.0d && recordButton.f22008OooO0oo < 12000.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.m3_extended_fab_change_size_collapse_motion_spec);
            } else if (recordButton.f22008OooO0oo > 12000.0d) {
                recordButton.f22011OooOO0o.setImageResource(R.animator.m3_extended_fab_change_size_expand_motion_spec);
            }
        }
    }

    public interface OooO0O0 {
    }

    public RecordButton(Context context) {
        super(context);
        this.f22005OooO0o = 0;
        this.f22007OooO0oO = 0.0f;
        this.f22008OooO0oo = 0.0d;
        this.f22003OooO = false;
        this.f22014OooOOOO = 60;
        this.f22015OooOOOo = Executors.newFixedThreadPool(1);
        this.f22016OooOOo0 = new OooO00o();
        this.f22013OooOOO0 = context;
        setText("按住 说话");
    }

    public final void OooO00o(int i) {
        if (this.f22004OooO0Oo == null) {
            Dialog dialog = new Dialog(this.f22013OooOOO0, R.bool.enable_system_alarm_service_default);
            this.f22004OooO0Oo = dialog;
            dialog.setContentView(R.array.anim_loading_horse_green);
            this.f22011OooOO0o = (ImageView) this.f22004OooO0Oo.findViewById(R.dimen.abc_action_bar_default_padding_start_material);
            this.f22010OooOO0O = (TextView) this.f22004OooO0Oo.findViewById(R.dimen.abc_action_bar_elevation_material);
        }
        if (i != 1) {
            this.f22011OooOO0o.setImageResource(R.animator.fragment_close_exit);
            this.f22010OooOO0O.setText("向上滑动可取消录音");
            setText("松开手指 完成录音");
        } else {
            this.f22011OooOO0o.setImageResource(R.animator.m3_extended_fab_show_motion_spec);
            this.f22010OooOO0O.setText("松开手指可取消录音");
            setText("松开手指 取消录音");
        }
        this.f22010OooOO0O.setTextSize(14.0f);
        this.f22004OooO0Oo.show();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float y = motionEvent.getY();
                    if (this.f22005OooO0o == 1) {
                        if (this.f22009OooOO0 - y > 50.0f) {
                            this.f22003OooO = true;
                            OooO00o(1);
                        }
                        if (this.f22009OooOO0 - y < 20.0f) {
                            this.f22003OooO = false;
                            OooO00o(0);
                        }
                    }
                } else if (action == 3) {
                    if (this.f22004OooO0Oo.isShowing()) {
                        this.f22004OooO0Oo.dismiss();
                    }
                    setText("按住 说话");
                    this.f22005OooO0o = 0;
                    this.f22003OooO = false;
                }
            } else if (this.f22005OooO0o == 1) {
                this.f22005OooO0o = 0;
                if (this.f22004OooO0Oo.isShowing()) {
                    this.f22004OooO0Oo.dismiss();
                }
                try {
                    this.f22006OooO0o0.stop();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f22008OooO0oo = 0.0d;
                if (this.f22003OooO) {
                    this.f22006OooO0o0.OooO0O0();
                } else if (this.f22007OooO0oO < 1.0f) {
                    Toast toast = new Toast(this.f22013OooOOO0);
                    toast.setView(LayoutInflater.from(this.f22013OooOOO0).inflate(R.array.anim_room_bottom_gift, (ViewGroup) null));
                    toast.setGravity(17, 0, 0);
                    toast.show();
                    this.f22006OooO0o0.OooO0O0();
                }
                this.f22003OooO = false;
                setText("按住 说话");
            } else {
                if (this.f22004OooO0Oo.isShowing()) {
                    this.f22004OooO0Oo.dismiss();
                }
                setText("按住 说话");
                this.f22003OooO = false;
            }
        } else if (this.f22005OooO0o != 1) {
            OooO00o(0);
            this.f22009OooOO0 = motionEvent.getY();
            if (this.f22006OooO0o0 != null) {
                this.f22006OooO0o0.OooO00o();
                this.f22005OooO0o = 1;
                try {
                    this.f22006OooO0o0.OooO0Oo(String.valueOf(this.f22012OooOOO) + File.separator + UUID.randomUUID().toString() + ".aac");
                    this.f22006OooO0o0.start();
                    this.f22015OooOOOo.execute(new com.will.codecs.audio.view.OooO00o(this));
                } catch (IOException e2) {
                    e2.printStackTrace();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        } else {
            this.f22016OooOOo0.obtainMessage(3).sendToTarget();
        }
        return true;
    }

    public void setAudioRecord(o000000O o000000o2) {
        this.f22006OooO0o0 = o000000o2;
    }

    public void setRecordListener(OooO0O0 oooO0O0) {
    }

    public void setRecordMaxTime(int i) {
        this.f22014OooOOOO = i;
    }

    public void setVoiceDir(String str) {
        this.f22012OooOOO = str;
    }

    public RecordButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22005OooO0o = 0;
        this.f22007OooO0oO = 0.0f;
        this.f22008OooO0oo = 0.0d;
        this.f22003OooO = false;
        this.f22014OooOOOO = 60;
        this.f22015OooOOOo = Executors.newFixedThreadPool(1);
        this.f22016OooOOo0 = new OooO00o();
        this.f22013OooOOO0 = context;
        setText("按住 说话");
    }

    public RecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22005OooO0o = 0;
        this.f22007OooO0oO = 0.0f;
        this.f22008OooO0oo = 0.0d;
        this.f22003OooO = false;
        this.f22014OooOOOO = 60;
        this.f22015OooOOOo = Executors.newFixedThreadPool(1);
        this.f22016OooOOo0 = new OooO00o();
        this.f22013OooOOO0 = context;
        setText("按住 说话");
    }
}
