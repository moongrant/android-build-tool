package com.zego.ve;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbConfiguration;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MediaRouter;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import java.util.Iterator;
import java.util.Map;
import p004OooO0oO.o0OoOo0;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(24)
public class AudioDeviceHelper {
    public static final int AUDIO_ROUTE_AIR_PLAY = 5;
    public static final int AUDIO_ROUTE_BLUETOOTH = 2;
    public static final int AUDIO_ROUTE_BLUETOOTH_A2DP = 6;
    public static final int AUDIO_ROUTE_HEADSET = 1;
    public static final int AUDIO_ROUTE_INVALID = -1;
    public static final int AUDIO_ROUTE_RECEIVER = 3;
    public static final int AUDIO_ROUTE_SPEAKER = 0;
    public static final int AUDIO_ROUTE_USB_AUDIO = 4;
    public static final int AUDIO_ROUTE_USB_HEADSET = 7;

    @TargetApi(21)
    public static boolean DetectUsbDeviceState(Context context) {
        boolean z = false;
        try {
            Iterator<Map.Entry<String, UsbDevice>> it = ((UsbManager) context.getSystemService("usb")).getDeviceList().entrySet().iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                try {
                    UsbDevice value = it.next().getValue();
                    if (value != null) {
                        for (int i = 0; !z2 && i < value.getConfigurationCount(); i++) {
                            UsbConfiguration configuration = value.getConfiguration(i);
                            if (configuration != null) {
                                for (int i2 = 0; i2 < configuration.getInterfaceCount(); i2++) {
                                    UsbInterface usbInterface = configuration.getInterface(i2);
                                    if (usbInterface != null && 1 == usbInterface.getInterfaceClass()) {
                                        z2 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    th.printStackTrace();
                    return z;
                }
            }
            return z2;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @TargetApi(21)
    public static boolean HasUsbAudioDevice(Intent intent) {
        UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra(DeviceRequestsHelper.DEVICE_INFO_DEVICE);
        if (usbDevice == null) {
            return false;
        }
        int configurationCount = usbDevice.getConfigurationCount();
        boolean z = false;
        for (int i = 0; !z && i < configurationCount; i++) {
            UsbConfiguration configuration = usbDevice.getConfiguration(i);
            if (configuration != null) {
                int interfaceCount = configuration.getInterfaceCount();
                for (int i2 = 0; i2 < interfaceCount; i2++) {
                    UsbInterface usbInterface = configuration.getInterface(i2);
                    if (usbInterface != null && usbInterface.getInterfaceClass() == 1) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public static String RoutType2String(int i) {
        if (i == 0) {
            return "SPEAKER";
        }
        if (i == 1) {
            return "WIRED_HEADSET";
        }
        if (i == 2) {
            return "BLUETOOTH_SCO";
        }
        if (i == 3) {
            return "RECEIVER";
        }
        if (i == 4) {
            return "USB_AUDIO";
        }
        if (i != 6) {
            return i != 7 ? "DEV_UNKNOWN" : "USB_HEADSET";
        }
        return "BLUETOOTH_A2DP";
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    @TargetApi(23)
    public static int getCurrentRoute(Context context, int i, boolean z) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        int i2 = 1;
        String string = ((MediaRouter) context.getSystemService("media_router")).getSelectedRoute(1).getName().toString();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i3 = -1;
        for (AudioDeviceInfo audioDeviceInfo : audioManager.getDevices(2)) {
            int routeType = getRouteType(audioDeviceInfo.getType());
            if (1 == routeType) {
                z4 = true;
            } else if (2 == routeType) {
                z2 = true;
            } else if (6 == routeType) {
                z5 = true;
            } else if (7 == routeType) {
                z3 = true;
            }
            if (string.equals(audioDeviceInfo.getProductName().toString())) {
                i3 = routeType;
            }
        }
        if (-1 == i3) {
            if (string.equalsIgnoreCase("USB")) {
                if (z3) {
                    i2 = 7;
                } else {
                    i2 = 4;
                }
            } else if (string.equalsIgnoreCase("iPhone") || string.equalsIgnoreCase("手机")) {
                if (z3) {
                    i2 = 7;
                } else if (!z4) {
                    if (z2) {
                        i2 = 2;
                    } else if (z5) {
                        if (3 != i) {
                            i2 = 6;
                        } else if (z) {
                            i2 = 0;
                        } else {
                            i2 = 3;
                        }
                    } else if (z) {
                        i2 = 0;
                    } else {
                        i2 = 3;
                    }
                }
            } else if (z2) {
                i2 = 2;
            } else if (z5) {
                if (3 != i) {
                    i2 = 6;
                } else if (z) {
                    i2 = 0;
                } else {
                    i2 = 3;
                }
            } else if (z3) {
                i2 = 7;
            } else if (!z4) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 3;
                }
            }
        } else if (i3 != 6) {
            i2 = i3;
        } else if (z2) {
            i2 = 2;
        } else if (3 != i) {
            i2 = i3;
        } else if (!z4) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 3;
            }
        }
        StringBuilder sbOooO0O0 = o0OoOo0.OooO0O0("current route:", string, " select route type:");
        sbOooO0O0.append(RoutType2String(i2));
        Log.i(DeviceRequestsHelper.DEVICE_INFO_DEVICE, sbOooO0O0.toString());
        return i2;
    }

    public static String getDeviceTypeStr(int i) {
        switch (i) {
            case 1:
                return "BUILTIN_EARPIECE";
            case 2:
                return "BUILTIN_SPEAKER";
            case 3:
                return "WIRED_HEADSET";
            case 4:
                return "WIRED_HEADPHONES";
            case 5:
                return "LINE_ANALOG";
            case 6:
                return "LINE_DIGITAL";
            case 7:
                return "BLUETOOTH_SCO";
            case 8:
                return "BLUETOOTH_A2DP";
            case 9:
                return "HDMI";
            case 10:
                return "HDMI_ARC";
            case 11:
                return "USB_DEVICE";
            case 12:
                return "USB_ACCESSORY";
            case 13:
                return "DOCK";
            case 14:
                return "FM";
            case 15:
                return "BUILTIN_MIC";
            case 16:
                return "FM_TUNER";
            case 17:
                return "TV_TUNER";
            case 18:
                return "TELEPHONY";
            case 19:
                return "AUX_LINE";
            case 20:
                return "IP";
            case 21:
                return "BUS";
            case 22:
                return "USB_HEADSET";
            case 23:
                return "HEARING_AID";
            case 24:
                return "SPEAKER_SAFE";
            case 25:
                return "REMOTE_SUBMIX";
            default:
                return "UNKNOWN";
        }
    }

    public static int getRouteType(int i) {
        int i2 = 1;
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            if (i != 3 && i != 4) {
                i2 = 7;
                if (i == 7) {
                    return 2;
                }
                if (i == 8) {
                    return 6;
                }
                if (i == 11 || i == 12) {
                    return 4;
                }
                if (i != 22) {
                    if (i != 24 && i == 25) {
                        return -1;
                    }
                }
            }
            return i2;
        }
        return 0;
    }

    public static boolean scoConnect(Context context) {
        for (AudioDeviceInfo audioDeviceInfo : ((AudioManager) context.getSystemService("audio")).getDevices(2)) {
            if (2 == getRouteType(audioDeviceInfo.getType())) {
                return true;
            }
        }
        return false;
    }
}
