#!/bin/bash

FROM=$1
TO=$2

mkdir -p `dirname ${TO}`
cp ${FROM} ${TO}
