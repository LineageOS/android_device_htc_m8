/*
 * Copyright (c) 2014 The CyanogenMod Project
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 * Also add information on how to contact you by electronic and paper mail.
 *
 */

package org.cyanogenmod.dotcase;

import android.graphics.Paint;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DotcaseConstants {
    static String ACTION_KILL_ACTIVITY = "org.cyanogenmod.dotcase.KILL_ACTIVITY";
    static String ACTION_REDRAW = "org.cyanogenmod.dotcase.REDRAW";
    public static int dotratio = 40;

    static final Set<String> MMS_APPS = new HashSet<String>(Arrays.asList(new String[] {
        "com.android.mms",
        "com.klinker.android.evolve_SMS"}));
    static final Set<String> TWITTER_APPS = new HashSet<String>(Arrays.asList(new String[] {
        "com.twitter.android",
        "com.klinker.android.twitter"}));

    static Paint pTrans = new Paint();
    static Paint pBlack = new Paint();
    static Paint pWhite = new Paint();
    static Paint pRed = new Paint();
    static Paint pGreen = new Paint();
    static Paint pBlue = new Paint();
    static Paint pOrange = new Paint();
    static Paint pPurple = new Paint();
    static Paint pYellow = new Paint();
    static Paint pGrey = new Paint();
    static Paint pCyan = new Paint();
    static Paint pDGreen = new Paint();
    static Paint pDRed = new Paint();
    static Paint pFYellow = new Paint();

    static {
        pTrans.setARGB(0, 0, 0, 0);
        pBlack.setARGB(255, 0, 0, 0);
        pWhite.setARGB(255, 255, 255, 255);
        pRed.setARGB(255, 255, 0, 0);
        pGreen.setARGB(255, 0, 255, 0);
        pBlue.setARGB(255, 0, 0, 255);
        pOrange.setARGB(255, 255, 165, 0);
        pPurple.setARGB(255, 160, 32, 240);
        pYellow.setARGB(255, 255, 255, 0);
        pGrey.setARGB(255, 69, 69, 69);
        pCyan.setARGB(255, 51, 181, 229);
        pDGreen.setARGB(255, 0, 128, 0);
        pDRed.setARGB(255, 128, 0, 0);
        pFYellow.setARGB(255, 255, 255, 153);
    }

    static int[][] torchSprite = {
        {0, 7, 7, 7, 7, 0},
        {7, 7, 7, 7, 7, 7},
        {7, 7, 7, 7, 7, 7},
        {7, 7, 7, 7, 7, 7},
        {7, 7, 7, 7, 7, 7},
        {0, 7, 7, 7, 7, 0},
        {0, 8, 8, 8, 8, 0},
        {0, 8, 8, 8, 8, 0},
        {0, 8, 8, 8, 8, 0}};

    static int[][] handsetSprite = {
        {3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3},
        {3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3},
        {3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3},
        {0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0},
        {0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 0}};

    static int[][] ringerSprite = {
        {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0},
        {0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0},
        {0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0},
        {0, 1, 1, 1, 0, 0, 2, 0, 0, 1, 1, 1, 0},
        {1, 1, 1, 0, 0, 2, 2, 2, 0, 0, 1, 1, 1},
        {0, 1, 0, 0, 2, 2, 2, 2, 2, 0, 0, 1, 0},
        {0, 0, 0, 2, 2, 2, 0, 2, 2, 2, 0, 0, 0},
        {0, 0, 2, 2, 2, 0, 0, 0, 2, 2, 2, 0, 0},
        {0, 2, 2, 2, 0, 0, 3, 0, 0, 2, 2, 2, 0},
        {2, 2, 2, 0, 0, 3, 3, 3, 0, 0, 2, 2, 2},
        {0, 2, 0, 0, 3, 3, 3, 3, 3, 0, 0, 2, 0},
        {0, 0, 0, 3, 3, 3, 0, 3, 3, 3, 0, 0, 0},
        {0, 0, 3, 3, 3, 0, 0, 0, 3, 3, 3, 0, 0},
        {0, 3, 3, 3, 0, 0, 0, 0, 0, 3, 3, 3, 0},
        {3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3},
        {0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0}};

    static int[][] lightningSprite = {
        {-1, -1, -1, -1,  0,  0, -1, -1},
        {-1, -1, -1,  0,  7,  0, -1, -1},
        {-1, -1,  0,  7,  7,  0, -1, -1},
        {-1,  0,  7,  7,  7,  0, -1, -1},
        { 0,  7,  7,  7,  7,  0,  0,  0},
        { 0,  0,  0,  7,  7,  7,  7,  0},
        {-1, -1,  0,  7,  7,  7,  0, -1},
        {-1, -1,  0,  7,  7,  0, -1, -1},
        {-1, -1,  0,  7,  0, -1, -1, -1},
        {-1, -1,  0,  0, -1, -1, -1, -1}};

    static int[][] clockSprite = {
        { 0, 12, 12, 12,  0,  0,  0,  0,  0, 12, 12, 12,  0},
        {12, 12, 12,  0,  0,  0,  0,  0,  0,  0, 12, 12, 12},
        {12, 12,  0,  0,  0,  0,  0,  0,  0,  0,  0, 12, 12},
        {12,  0,  0,  0, 12, 12, 12, 12, 12,  0,  0,  0, 12},
        { 0,  0,  0, 12,  0,  0,  0,  0,  0, 12,  0,  0,  0},
        { 0,  0, 12,  0,  0,  0, 12,  0,  0,  0, 12,  0,  0},
        { 0,  0, 12,  0,  0,  0, 12,  0,  0,  0, 12,  0,  0},
        { 0,  0, 12,  0,  0,  0, 12, 12, 12,  0, 12,  0,  0},
        { 0,  0, 12,  0,  0,  0,  0,  0,  0,  0, 12,  0,  0},
        { 0,  0, 12,  0,  0,  0,  0,  0,  0,  0, 12,  0,  0},
        { 0,  0,  0, 12,  0,  0,  0,  0,  0, 12,  0,  0,  0},
        { 0,  0,  0,  0, 12, 12, 12, 12, 12,  0,  0,  0,  0},
        { 0,  0,  0, 12,  0,  0,  0,  0,  0, 12,  0,  0,  0}};

    static int[][] snoozeArray = {
        {12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12},
        {12,  0,  0, 0, 12,  0, 12, 0, 12,  0, 12, 0, 12,  0, 12, 0,  0,  0, 12, 0, 12,  0,  0},
        {12, 12, 12, 0, 12,  0, 12, 0, 12,  0, 12, 0, 12,  0, 12, 0,  0, 12,  0, 0, 12, 12, 12},
        { 0,  0, 12, 0, 12,  0, 12, 0, 12,  0, 12, 0, 12,  0, 12, 0, 12,  0,  0, 0, 12,  0,  0},
        {12, 12, 12, 0, 12,  0, 12, 0, 12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12}};

    static int[][] alarmCancelArray = {
        {12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12, 0, 12,  0,  0},
        {12,  0,  0, 0, 12,  0, 12, 0, 12,  0, 12, 0, 12,  0,  0, 0, 12,  0,  0, 0, 12,  0,  0},
        {12,  0,  0, 0, 12, 12, 12, 0, 12,  0, 12, 0, 12,  0,  0, 0, 12, 12, 12, 0, 12,  0,  0},
        {12,  0,  0, 0, 12,  0, 12, 0, 12,  0, 12, 0, 12,  0,  0, 0, 12,  0,  0, 0, 12,  0,  0},
        {12, 12, 12, 0, 12,  0, 12, 0, 12,  0, 12, 0, 12, 12, 12, 0, 12, 12, 12, 0, 12, 12, 12}};

    static int[][] hangoutsSprite = {
        {0, 0, 0, 0, 0, 0, 0},
        {0, 3, 3, 3, 3, 3, 0},
        {3, 3, 1, 3, 1, 3, 3},
        {3, 3, 1, 3, 1, 3, 3},
        {0, 3, 3, 3, 3, 3, 0},
        {0, 0, 0, 3, 3, 0, 0},
        {0, 0, 0, 3, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0}};

    static int[][] mmsSprite = {
        {0, 0, 0, 0, 0, 0, 0},
        {3, 3, 3, 3, 3, 3, 3},
        {3, 3, 3, 3, 3, 3, 3},
        {3, 3, 3, 3, 3, 3, 3},
        {3, 3, 3, 3, 3, 3, 3},
        {3, 3, 3, 3, 3, 3, 3},
        {0, 3, 3, 0, 0, 0, 0},
        {0, 3, 0, 0, 0, 0, 0}};

    static int[][] twitterSprite = {
        {0, 0, 0, 0, 0, 0, 0},
        {0, 0, 9, 9, 0, 0, 0},
        {0, 0, 9, 9, 9, 9, 0},
        {0, 0, 9, 9, 9, 9, 0},
        {0, 0, 9, 9, 0, 0, 0},
        {0, 0, 9, 9, 9, 9, 0},
        {0, 0, 0, 9, 9, 9, 0},
        {0, 0, 0, 0, 0, 0, 0}};

    static int[][] voicemailSprite = { // this icon is shit
        {0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0},
        {0, 7, 7, 0, 7, 7, 0},
        {7, 0, 0, 7, 0, 0, 7},
        {7, 0, 0, 7, 0, 0, 7},
        {0, 7, 7, 7, 7, 7, 0},
        {0, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 0}};

    static int[][] missedCallSprite = {
        {0, 0, 0, 0, 0, 0, 0},
        {0, 1, 0, 0, 0, 1, 0},
        {0, 0, 1, 0, 1, 0, 0},
        {0, 0, 0, 1, 0, 0, 0},
        {0, 7, 7, 7, 7, 7, 0},
        {7, 7, 7, 7, 7, 7, 7},
        {7, 7, 0, 0, 0, 7, 7},
        {0, 0, 0, 0, 0, 0, 0}};

    static int[][] gmailSprite = {
        {0, 0, 0, 0, 0, 0, 0},
        {2, 1, 1, 1, 1, 1, 2},
        {2, 2, 1, 1, 1, 2, 2},
        {2, 1, 2, 1, 2, 1, 2},
        {2, 1, 1, 2, 1, 1, 2},
        {2, 1, 1, 1, 1, 1, 2},
        {2, 1, 1, 1, 1, 1, 2},
        {0, 0, 0, 0, 0, 0, 0}};

    static int[][] timeColon = {
        {9},
        {0},
        {0},
        {9}};

    static int[][] smallTimeColon = {
        {9},
        {0},
        {9}};

    static int[][] amSprite = {
        {9, 9, 9, 0, 9, 9, 0, 9, 9},
        {9, 0, 9, 0, 9, 0, 9, 0, 9},
        {9, 9, 9, 0, 9, 0, 9, 0, 9},
        {9, 0, 9, 0, 9, 0, 0, 0, 9},
        {9, 0, 9, 0, 9, 0, 0, 0, 9}};

    static int[][] pmSprite = {
        {9, 9, 9, 0, 9, 9, 0, 9, 9},
        {9, 0, 9, 0, 9, 0, 9, 0, 9},
        {9, 9, 9, 0, 9, 0, 9, 0, 9},
        {9, 0, 0, 0, 9, 0, 0, 0, 9},
        {9, 0, 0, 0, 9, 0, 0, 0, 9}};

    static int[][] batteryOutlineSprite = {
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
        {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}};

    static int[][] getSprite(char c) {
        int[][] sprite;
        switch (c) {
            case '0':
                sprite = new int[][] {
                    {-1,  9,  9, -1},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    {-1,  9,  9, -1}
                };
                break;
            case '1':
                sprite = new int[][] {
                    {-1, -1,  9, -1},
                    {-1,  9,  9, -1},
                    {-1, -1,  9, -1},
                    {-1, -1,  9, -1},
                    {-1, -1,  9, -1},
                    {-1, -1,  9, -1},
                    {-1, -1,  9, -1},
                    {-1, -1,  9, -1},
                    {-1, -1,  9, -1},
                    {-1, -1,  9, -1},
                    {-1,  9,  9,  9}
                };
                break;
            case '2':
                sprite = new int[][] {
                    {-1,  9,  9, -1},
                    { 9, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1,  9, -1},
                    {-1, -1,  9, -1},
                    {-1,  9, -1, -1},
                    {-1,  9, -1, -1},
                    { 9, -1, -1, -1},
                    { 9, -1, -1, -1},
                    { 9,  9,  9,  9}
                };
                break;
            case '3':
                sprite = new int[][] {
                    {-1,  9,  9, -1},
                    { 9, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1,  9,  9, -1},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    { 9, -1, -1,  9},
                    {-1,  9,  9, -1}
                };
                break;
            case '4':
                sprite = new int[][] {
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9,  9,  9,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9}
                };
                break;
            case '5':
                sprite = new int[][] {
                    { 9,  9,  9,  9},
                    { 9, -1, -1, -1},
                    { 9, -1, -1, -1},
                    { 9, -1, -1, -1},
                    { 9, -1, -1, -1},
                    { 9,  9,  9, -1},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    { 9, -1, -1,  9},
                    {-1,  9,  9, -1}
                };
                break;
            case '6':
                sprite = new int[][] {
                    {-1,  9,  9, -1},
                    { 9, -1, -1,  9},
                    { 9, -1, -1, -1},
                    { 9, -1, -1, -1},
                    { 9, -1, -1, -1},
                    { 9,  9,  9, -1},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    {-1,  9,  9, -1}
                };
                break;
            case '7':
                sprite = new int[][] {
                    { 9,  9,  9,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9}
                };
                break;
            case '8':
                sprite = new int[][] {
                    {-1,  9,  9, -1},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    {-1,  9,  9, -1},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    {-1,  9,  9, -1}
                };
                break;
            case '9':
                sprite = new int[][] {
                    {-1,  9,  9, -1},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    { 9, -1, -1,  9},
                    {-1,  9,  9,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    {-1, -1, -1,  9},
                    { 9, -1, -1,  9},
                    {-1,  9,  9, -1}
                };
                break;
            default:
                sprite = new int[][] {
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1},
                    {-1, -1, -1, -1}
                };
                break;
        }

        return sprite;
    }

    static int[][] getSmallSprite(char c) {
        int[][] sprite;
        switch (c) {
            case '0':
                sprite = new int[][] {
                    { 9,  9,  9},
                    { 9, -1,  9},
                    { 9, -1,  9},
                    { 9, -1,  9},
                    { 9,  9,  9}
                };
                break;
            case '1':
                sprite = new int[][] {
                    { 9,  9, -1},
                    {-1,  9, -1},
                    {-1,  9, -1},
                    {-1,  9, -1},
                    { 9,  9,  9}
                };
                break;
            case '2':
                sprite = new int[][] {
                    { 9,  9,  9},
                    {-1, -1,  9},
                    { 9,  9,  9},
                    { 9, -1, -1},
                    { 9,  9,  9}
                };
                break;
            case '3':
                sprite = new int[][] {
                    { 9,  9,  9},
                    {-1, -1,  9},
                    { 9,  9,  9},
                    {-1, -1,  9},
                    { 9,  9,  9}
                };
                break;
            case '4':
                sprite = new int[][] {
                    { 9, -1,  9},
                    { 9, -1,  9},
                    { 9,  9,  9},
                    {-1, -1,  9},
                    {-1, -1,  9}
                };
                break;
            case '5':
                sprite = new int[][] {
                    { 9,  9,  9},
                    { 9, -1, -1},
                    { 9,  9,  9},
                    {-1, -1,  9},
                    { 9,  9,  9}
                };
                break;
            case '6':
                sprite = new int[][] {
                    { 9,  9,  9},
                    { 9, -1, -1},
                    { 9,  9,  9},
                    { 9, -1,  9},
                    { 9,  9,  9}
                };
                break;
            case '7':
                sprite = new int[][] {
                    { 9,  9,  9},
                    {-1, -1,  9},
                    {-1, -1,  9},
                    {-1, -1,  9},
                    {-1, -1,  9}
                };
                break;
            case '8':
                sprite = new int[][] {
                    { 9,  9,  9},
                    { 9, -1,  9},
                    { 9,  9,  9},
                    { 9, -1,  9},
                    { 9,  9,  9}
                };
                break;
            case '9':
                sprite = new int[][] {
                    { 9,  9,  9},
                    { 9, -1,  9},
                    { 9,  9,  9},
                    {-1, -1,  9},
                    { 9,  9,  9}
                };
                break;
            default:
                sprite = new int[][] {
                    {-1, -1, -1},
                    {-1, -1, -1},
                    {-1, -1, -1},
                    {-1, -1, -1},
                    {-1, -1, -1}
                };
                break;
        }

        return sprite;
    }

    static Paint getPaintFromNumber(int color) {
        switch (color) {
            case -1:
                return pTrans;
            case 0:
                return pBlack;
            case 1:
                return pWhite;
            case 2:
                return pRed;
            case 3:
                return pGreen;
            case 4:
                return pBlue;
            case 5:
                return pOrange;
            case 6:
                return pPurple;
            case 7:
                return pYellow;
            case 8:
                return pGrey;
            case 9:
                return pCyan;
            case 10:
                return pDGreen;
            case 11:
                return pDRed;
            case 12:
                return pFYellow;
            default:
                return pBlack;
        }
    }
}
