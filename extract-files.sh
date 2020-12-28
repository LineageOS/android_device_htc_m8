#!/bin/bash
#
# Copyright (C) 2016 The CyanogenMod Project
# Copyright (C) 2017-2020 The LineageOS Project
#
# SPDX-License-Identifier: Apache-2.0
#

set -e

export DEVICE=m8
export DEVICE_COMMON=m8-common
export VENDOR=htc

"./../../${VENDOR}/${DEVICE_COMMON}/extract-files.sh" "$@"
