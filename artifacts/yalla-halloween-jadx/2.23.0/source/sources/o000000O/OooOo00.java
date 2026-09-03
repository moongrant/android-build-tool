package o000000O;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.zego.zegoavkit2.ZegoConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends OooO0o {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public float f33852OooOOo0;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public String f33841OooO0o0 = null;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33840OooO0o = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f33842OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public String f33843OooO0oo = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f33839OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f33844OooOO0 = -1;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public View f33845OooOO0O = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f33846OooOO0o = 0.1f;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f33848OooOOO0 = true;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f33847OooOOO = true;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f33849OooOOOO = true;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public float f33850OooOOOo = Float.NaN;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f33851OooOOo = false;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f33853OooOOoo = -1;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f33856OooOo00 = -1;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public int f33855OooOo0 = -1;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public RectF f33857OooOo0O = new RectF();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public RectF f33858OooOo0o = new RectF();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public HashMap<String, Method> f33854OooOo = new HashMap<>();

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final SparseIntArray f33859OooO00o;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f33859OooO00o = sparseIntArray;
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_framePosition, 8);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_onCross, 4);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_onNegativeCross, 1);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_onPositiveCross, 2);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_motionTarget, 7);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_triggerId, 6);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_triggerSlack, 5);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_motion_triggerOnCollision, 9);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_motion_postLayoutCollision, 10);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_triggerReceiver, 11);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_viewTransitionOnCross, 12);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_viewTransitionOnNegativeCross, 13);
            sparseIntArray.append(androidx.constraintlayout.widget.OooO.KeyTrigger_viewTransitionOnPositiveCross, 14);
        }
    }

    public OooOo00() {
        this.f33770OooO0Oo = new HashMap<>();
    }

    public static void OooOO0(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    public final void OooO(View view, String str) {
        Method method;
        if (str == null) {
            return;
        }
        if (!str.startsWith(".")) {
            if (this.f33854OooOo.containsKey(str)) {
                method = this.f33854OooOo.get(str);
                if (method == null) {
                    return;
                }
            } else {
                method = null;
            }
            if (method == null) {
                try {
                    method = view.getClass().getMethod(str, new Class[0]);
                    this.f33854OooOo.put(str, method);
                } catch (NoSuchMethodException unused) {
                    this.f33854OooOo.put(str, null);
                    Log.e("KeyTrigger", "Could not find method \"" + str + "\"on class " + view.getClass().getSimpleName() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000000O.OooO00o.OooO0Oo(view));
                    return;
                }
            }
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused2) {
                Log.e("KeyTrigger", "Exception in call \"" + this.f33841OooO0o0 + "\"on class " + view.getClass().getSimpleName() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000000O.OooO00o.OooO0Oo(view));
                return;
            }
        }
        boolean z = str.length() == 1;
        if (!z) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.f33770OooO0Oo.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z || lowerCase.matches(str)) {
                ConstraintAttribute constraintAttribute = this.f33770OooO0Oo.get(str2);
                if (constraintAttribute != null) {
                    Class<?> cls = view.getClass();
                    boolean z2 = constraintAttribute.f4905OooO00o;
                    String str3 = constraintAttribute.f4906OooO0O0;
                    String strOooO00o = !z2 ? o00O00OO.OooO00o("set", str3) : str3;
                    try {
                        switch (ConstraintAttribute.OooO00o.f4913OooO00o[constraintAttribute.f4907OooO0OO.ordinal()]) {
                            case 1:
                            case 6:
                                cls.getMethod(strOooO00o, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f4908OooO0Oo));
                                break;
                            case 2:
                                cls.getMethod(strOooO00o, Boolean.TYPE).invoke(view, Boolean.valueOf(constraintAttribute.f4911OooO0oO));
                                break;
                            case 3:
                                cls.getMethod(strOooO00o, CharSequence.class).invoke(view, constraintAttribute.f4909OooO0o);
                                break;
                            case 4:
                                cls.getMethod(strOooO00o, Integer.TYPE).invoke(view, Integer.valueOf(constraintAttribute.f4912OooO0oo));
                                break;
                            case 5:
                                Method method2 = cls.getMethod(strOooO00o, Drawable.class);
                                ColorDrawable colorDrawable = new ColorDrawable();
                                colorDrawable.setColor(constraintAttribute.f4912OooO0oo);
                                method2.invoke(view, colorDrawable);
                                break;
                            case 7:
                                cls.getMethod(strOooO00o, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f4910OooO0o0));
                                break;
                            case 8:
                                cls.getMethod(strOooO00o, Float.TYPE).invoke(view, Float.valueOf(constraintAttribute.f4910OooO0o0));
                                break;
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbOooO00o = p004OooO0oO.o0OoOo0.OooO00o(" Custom Attribute \"", str3, "\" not found on ");
                        sbOooO00o.append(cls.getName());
                        Log.e("TransitionLayout", sbOooO00o.toString());
                        e.printStackTrace();
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", e2.getMessage());
                        Log.e("TransitionLayout", " Custom Attribute \"" + str3 + "\" not found on " + cls.getName());
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + strOooO00o);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbOooO00o2 = p004OooO0oO.o0OoOo0.OooO00o(" Custom Attribute \"", str3, "\" not found on ");
                        sbOooO00o2.append(cls.getName());
                        Log.e("TransitionLayout", sbOooO00o2.toString());
                        e3.printStackTrace();
                    }
                }
            }
        }
    }

    @Override // o000000O.OooO0o
    public final void OooO00o(HashMap<String, o000000.OooO0o> map) {
    }

    @Override // o000000O.OooO0o
    /* JADX INFO: renamed from: OooO0O0 */
    public final OooO0o clone() {
        OooOo00 oooOo00 = new OooOo00();
        super.OooO0OO(this);
        oooOo00.f33841OooO0o0 = this.f33841OooO0o0;
        oooOo00.f33840OooO0o = this.f33840OooO0o;
        oooOo00.f33842OooO0oO = this.f33842OooO0oO;
        oooOo00.f33843OooO0oo = this.f33843OooO0oo;
        oooOo00.f33839OooO = this.f33839OooO;
        oooOo00.f33844OooOO0 = this.f33844OooOO0;
        oooOo00.f33845OooOO0O = this.f33845OooOO0O;
        oooOo00.f33846OooOO0o = this.f33846OooOO0o;
        oooOo00.f33848OooOOO0 = this.f33848OooOOO0;
        oooOo00.f33847OooOOO = this.f33847OooOOO;
        oooOo00.f33849OooOOOO = this.f33849OooOOOO;
        oooOo00.f33850OooOOOo = this.f33850OooOOOo;
        oooOo00.f33852OooOOo0 = this.f33852OooOOo0;
        oooOo00.f33851OooOOo = this.f33851OooOOo;
        oooOo00.f33857OooOo0O = this.f33857OooOo0O;
        oooOo00.f33858OooOo0o = this.f33858OooOo0o;
        oooOo00.f33854OooOo = this.f33854OooOo;
        return oooOo00;
    }

    @Override // o000000O.OooO0o
    public final void OooO0Oo(HashSet<String> hashSet) {
    }

    @Override // o000000O.OooO0o
    public final void OooO0o0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.OooO.KeyTrigger);
        SparseIntArray sparseIntArray = OooO00o.f33859OooO00o;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = OooO00o.f33859OooO00o;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f33842OooO0oO = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 2:
                    this.f33843OooO0oo = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.f33841OooO0o0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 5:
                    this.f33846OooOO0o = typedArrayObtainStyledAttributes.getFloat(index, this.f33846OooOO0o);
                    break;
                case 6:
                    this.f33839OooO = typedArrayObtainStyledAttributes.getResourceId(index, this.f33839OooO);
                    break;
                case 7:
                    if (MotionLayout.f4572o00o0O) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f33768OooO0O0);
                        this.f33768OooO0O0 = resourceId;
                        if (resourceId == -1) {
                            this.f33769OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f33769OooO0OO = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f33768OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f33768OooO0O0);
                    }
                    break;
                case 8:
                    int integer = typedArrayObtainStyledAttributes.getInteger(index, this.f33767OooO00o);
                    this.f33767OooO00o = integer;
                    this.f33850OooOOOo = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.f33844OooOO0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f33844OooOO0);
                    break;
                case 10:
                    this.f33851OooOOo = typedArrayObtainStyledAttributes.getBoolean(index, this.f33851OooOOo);
                    break;
                case 11:
                    this.f33840OooO0o = typedArrayObtainStyledAttributes.getResourceId(index, this.f33840OooO0o);
                    break;
                case 12:
                    this.f33855OooOo0 = typedArrayObtainStyledAttributes.getResourceId(index, this.f33855OooOo0);
                    break;
                case 13:
                    this.f33853OooOOoo = typedArrayObtainStyledAttributes.getResourceId(index, this.f33853OooOOoo);
                    break;
                case 14:
                    this.f33856OooOo00 = typedArrayObtainStyledAttributes.getResourceId(index, this.f33856OooOo00);
                    break;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9 A[PHI: r0 r5
      0x00d9: PHI (r0v11 boolean) = (r0v7 boolean), (r0v7 boolean), (r0v12 boolean) binds: [B:50:0x00bd, B:52:0x00c1, B:58:0x00d8] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r5v13 boolean) = (r5v7 boolean), (r5v7 boolean), (r5v14 boolean) binds: [B:50:0x00bd, B:52:0x00c1, B:58:0x00d8] A[DONT_GENERATE, DONT_INLINE]] */
    public final void OooO0oo(View view, float f) {
        boolean z;
        boolean z2;
        boolean z3;
        float f2;
        float f3;
        boolean z4;
        float f4;
        float f5;
        if (this.f33844OooOO0 != -1) {
            if (this.f33845OooOO0O == null) {
                this.f33845OooOO0O = ((ViewGroup) view.getParent()).findViewById(this.f33844OooOO0);
            }
            OooOO0(this.f33857OooOo0O, this.f33845OooOO0O, this.f33851OooOOo);
            OooOO0(this.f33858OooOo0o, view, this.f33851OooOOo);
            if (this.f33857OooOo0O.intersect(this.f33858OooOo0o)) {
                if (this.f33848OooOOO0) {
                    this.f33848OooOOO0 = false;
                    z = true;
                } else {
                    z = false;
                }
                if (this.f33849OooOOOO) {
                    this.f33849OooOOOO = false;
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f33847OooOOO = true;
                z2 = false;
            } else {
                if (this.f33848OooOOO0) {
                    z = false;
                } else {
                    this.f33848OooOOO0 = true;
                    z = true;
                }
                if (this.f33847OooOOO) {
                    this.f33847OooOOO = false;
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.f33849OooOOOO = true;
                z2 = z3;
                z4 = false;
            }
        } else {
            if (this.f33848OooOOO0) {
                float f6 = this.f33850OooOOOo;
                if ((this.f33852OooOOo0 - f6) * (f - f6) < 0.0f) {
                    this.f33848OooOOO0 = false;
                    z = true;
                }
                if (this.f33847OooOOO) {
                    f4 = this.f33850OooOOOo;
                    f5 = f - f4;
                    if ((this.f33852OooOOo0 - f4) * f5 >= 0.0f && f5 < 0.0f) {
                        this.f33847OooOOO = false;
                        z2 = true;
                    }
                    if (this.f33849OooOOOO) {
                        f2 = this.f33850OooOOOo;
                        f3 = f - f2;
                        if ((this.f33852OooOOo0 - f2) * f3 < 0.0f || f3 <= 0.0f) {
                            z4 = false;
                        } else {
                            this.f33849OooOOOO = false;
                            z4 = true;
                        }
                    } else {
                        if (Math.abs(f - this.f33850OooOOOo) > this.f33846OooOO0o) {
                            this.f33849OooOOOO = true;
                        }
                        z3 = z2;
                        z2 = z3;
                        z4 = false;
                    }
                } else if (Math.abs(f - this.f33850OooOOOo) > this.f33846OooOO0o) {
                    this.f33847OooOOO = true;
                }
                z2 = false;
                if (this.f33849OooOOOO) {
                    f2 = this.f33850OooOOOo;
                    f3 = f - f2;
                    if ((this.f33852OooOOo0 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                } else {
                    if (Math.abs(f - this.f33850OooOOOo) > this.f33846OooOO0o) {
                        this.f33849OooOOOO = true;
                    }
                    z3 = z2;
                    z2 = z3;
                    z4 = false;
                }
            } else if (Math.abs(f - this.f33850OooOOOo) > this.f33846OooOO0o) {
                this.f33848OooOOO0 = true;
            }
            z = false;
            if (this.f33847OooOOO) {
                f4 = this.f33850OooOOOo;
                f5 = f - f4;
                if ((this.f33852OooOOo0 - f4) * f5 >= 0.0f) {
                }
                if (this.f33849OooOOOO) {
                    f2 = this.f33850OooOOOo;
                    f3 = f - f2;
                    if ((this.f33852OooOOo0 - f2) * f3 < 0.0f) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                } else {
                    if (Math.abs(f - this.f33850OooOOOo) > this.f33846OooOO0o) {
                        this.f33849OooOOOO = true;
                    }
                    z3 = z2;
                    z2 = z3;
                    z4 = false;
                }
            } else if (Math.abs(f - this.f33850OooOOOo) > this.f33846OooOO0o) {
                this.f33847OooOOO = true;
            }
            z2 = false;
            if (this.f33849OooOOOO) {
                f2 = this.f33850OooOOOo;
                f3 = f - f2;
                if ((this.f33852OooOOo0 - f2) * f3 < 0.0f) {
                    z4 = false;
                } else {
                    z4 = false;
                }
            } else {
                if (Math.abs(f - this.f33850OooOOOo) > this.f33846OooOO0o) {
                    this.f33849OooOOOO = true;
                }
                z3 = z2;
                z2 = z3;
                z4 = false;
            }
        }
        this.f33852OooOOo0 = f;
        if (z2 || z || z4) {
            MotionLayout motionLayout = (MotionLayout) view.getParent();
            MotionLayout.OooOOOO oooOOOO = motionLayout.f4593OooOo0o;
            if (oooOOOO != null) {
                oooOOOO.OooO0O0();
            }
            CopyOnWriteArrayList<MotionLayout.OooOOOO> copyOnWriteArrayList = motionLayout.f4611Oooo0oo;
            if (copyOnWriteArrayList != null) {
                Iterator<MotionLayout.OooOOOO> it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    it.next().OooO0O0();
                }
            }
        }
        View viewFindViewById = this.f33840OooO0o == -1 ? view : ((MotionLayout) view.getParent()).findViewById(this.f33840OooO0o);
        if (z2) {
            String str = this.f33842OooO0oO;
            if (str != null) {
                OooO(viewFindViewById, str);
            }
            if (this.f33853OooOOoo != -1) {
                ((MotionLayout) view.getParent()).OooOo(this.f33853OooOOoo, viewFindViewById);
            }
        }
        if (z4) {
            String str2 = this.f33843OooO0oo;
            if (str2 != null) {
                OooO(viewFindViewById, str2);
            }
            if (this.f33856OooOo00 != -1) {
                ((MotionLayout) view.getParent()).OooOo(this.f33856OooOo00, viewFindViewById);
            }
        }
        if (z) {
            String str3 = this.f33841OooO0o0;
            if (str3 != null) {
                OooO(viewFindViewById, str3);
            }
            if (this.f33855OooOo0 != -1) {
                ((MotionLayout) view.getParent()).OooOo(this.f33855OooOo0, viewFindViewById);
            }
        }
    }
}
